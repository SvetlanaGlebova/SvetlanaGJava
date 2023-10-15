package com.company.project.lesson07;

import java.time.LocalDate;

public class Author {
    //свойства, поля, атрибуты
    public long id; //значение по умолчанию 0
    public String name;
    public Author(long authorId){
        id = authorId;
    }
    public Author(long authorId, String name){
        this(authorId);
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Автор: id= " + id + ", name= " + name);
    }

    public String getInfo(){
        return "Автор: id= " + id + ", name= " + name;
    }

    public void getInfo(String prefix){
        if (prefix == null) return;
        System.out.println(prefix + "Автор: id= " + id + ", name= " + name);
    }

}
