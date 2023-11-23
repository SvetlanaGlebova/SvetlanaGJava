package com.company.project.lesson21;

import com.company.project.lesson20.Student;

import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Lesson21 {

    public void someVoid01(){
        //анонимный класс
        Runnable runnable = () -> System.out.println("Hello");
        Runnable runnable02 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
    }
    //T apply(T t1, T t2);
    //public static double sum(double a, double b) {
    //return a + b;
    //}
   /* BinaryOperator<ArrayList<Student>> binaryOperatorL = (a, b) -> a + b;
    BinaryOperator<Double> binaryOperator = Double::sum;
    binaryOperatorL.apply(34.7, 89.9);
    binaryOperator.apply(34.7, 89.9);*/

    //внутренний класс
    public class SubClass01{}
    //вложенный класс
    public static class SubClass02{}
    
}
