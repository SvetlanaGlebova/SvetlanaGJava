package com.company.project.coursework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth; //прочитать про класс localDateTime
    private TypeAbonement typeAbonement;

    public User(String firstname, String lastname, LocalDate dateOfBirth) {
        if (firstname == null || firstname.length() > 10) {
            System.err.println("Firstname = null или больше 10!");
        }
        if (lastname == null || lastname.length() > 10) {
            System.err.println("lastname = null или больше 10!");
        }
        if (dateOfBirth == null || dateOfBirth.isBefore(LocalDate.now())) {
            System.err.println("Wrong format!");
        }
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFisrtname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(dateOfBirth, user.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, dateOfBirth);
    }

    @Override
    public String toString() {
        return "firstname ".concat(firstname)
                .concat("lastname ")
                .concat(lastname)
                .concat("Date Of Birth ")
                .concat(String.valueOf(dateOfBirth))
                .concat("TypeAbonement ")
                .concat(typeAbonement.toString());

    }

    public TypeAbonement getTypeAbonement() {
        return typeAbonement;
    }

    public void setTypeAbonement(TypeAbonement typeAbonement) {
        this.typeAbonement = typeAbonement;
    }
}

