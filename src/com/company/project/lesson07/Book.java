package com.company.project.lesson07;

public class Book {
    private String name; //null
    private boolean isPublished; //false
    // private Author author;

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
}
