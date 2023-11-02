package com.company.project.lesson14;

import java.time.temporal.Temporal;

//1. Generic без ограничений компилируется в Object
//2. Generic с ограничениями компилируется в тип ограничения
public class GenericMethods {
    public static <T> boolean inArray(T[] array, T element) {
        if (array == null || element == null) return false;
        for (T elem : array) {
            if (elem != null && elem.equals(element)) return true;
        }
        return false;
    }
    //generic с ограничениями (bounded)
    //T - компелируется с Number
    //K - компелируется с Temporal
    // public static <T extends Number, K> extends Temporal;

    /*int compareHashCodes(T first, K second) {
        System.out.println(first LongValue());
        System.out.println();
        return Ineger.compare(first.hashCode(), second.hashCode());*/

    private Object LongValue() {

        public static void main (String[]args)String[] strings;
        String string;
        {
            strings = {"red", "blue", "pink"};
            string = "yellow";

        }

        Integer[] integers = {45, 89, 0, 34, -1};
        Integer integer = 3;

        boolean res;
        res = GenericMethods.<Number>inArray(integers, integer);

        User<String> stringUser = new User<>("12qw");
        stringUser.setId(stringUser.getId().toLowerCase());

        User<Integer> integerUser = new User<>(1);
        integerUser.setId(integerUser.getId() + 1);

        //необработанный/сырой/raw тип
        User rawUser = new User("12");
        rawUser.setId(12);
        rawUser.setId(stringUser);
        System.out.println(rawUser.getId().toString());


        //<String> указывает на то, что в метод можно передавать
        //указанный тип и его подтипы
        res = GenericMethods.<String>inArray(strings, string);
    }

    /*<Number> указывает на то, что в метод можно передать
    //указанный тип и его подтипы*/


    // <Number> inArray(integers, integer) {

    /*<Object
    res = GenericMethods.<Number>;*/
}

