package com.company.project.lesson13;

public class Primitive {
    public static void main(String[] args) {
        int num = 568;
        Integer count = 56;
    }
    //автоупаковка
    Integer age = 20;
    private int num;
    int count = num;

    //автораспаковка
    double price;
    Double value = 45.3;
    price = value;

    private byte oneB;
    //Правила автоупаковки иавтораспаковки:
    //1. автоупаковка не работает, если примитив соотве-т классу обертки
    byte oneB = 1;
    //Integer oneB = oneB; автоупаковка не сработает
    Integer oneI = (int) oneB;
    //2. на авотраспаковку правило №1 не распространяется

    Integer x = 9;
    Integer y = 9;
    System.out.println(x == y) //return true;
    

}
