package com.company.project.lesson07;

public class lesson07 {
    public static void main(String[]args){
        Author author01 = new Author(1);
        System.out.println(author01.id); //1
        author01.name = "Sveta";
        Author author02 = new Author(2, "Sveta");
        author02.name = "   ";
        //Author author03 = new Author();

        String info02 = author02.getInfo();
        author02.printInfo();
        //author03.getInfo();
        System.out.println(author01.id);

        //Book book01 = new Book();
        //book01.setName("Java");



    }
}
