package com.company.project.lesson07;

public class Book {
    private String name; //null
    private boolean isPublished; //false
    // private Author author;
    private int numberOfAuthors;

    public Book(String name){
        setName(name);
    }

    public void setName(String name){
        //if (name == null) return;
        if (name == null) {
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;

    }

    public String getName(){ //Getter
        return name;

    }
    public void addAddAuthor (Author author){
        for (int numberOfAuthors; numberOfAuthors >=1; numberOfAuthors <5);
    if (author == null) return;


}
