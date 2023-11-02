package com.company.project.coursework;

import java.time.LocalDateTime;
import java.util.Objects;

public class User {
    private String fisrtname;
    private String lastname;
    private LocalDateTime dateOfBirth; //прочитать про класс localDateTime

    public User(String fisrtname, String lastname, LocalDateTime dateOfBirth) {
        this.fisrtname = fisrtname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(fisrtname, user.fisrtname) && Objects.equals(lastname, user.lastname) && Objects.equals(dateOfBirth, user.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fisrtname, lastname, dateOfBirth); //почитать hashCode
    }

    @Override
    public String toString() {
        return "firstname ".concat(fisrtname)
                .concat("lastname ")
                .concat(lastname)
                .concat("Date Of Birth ")
                .concat(String.valueOf(dateOfBirth));

    }
}

