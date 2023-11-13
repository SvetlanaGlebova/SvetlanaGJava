package com.company.project.lesson18;

import com.company.project.lesson1516.Fruit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lesson18 {
    public static void main(String[] args) {
        Operation plus = (first, second) -> first + second;
        System.out.println(plus);
    }

    private Operation first;
    /*
        class Plus implements Operation {

            @Override
            public double action(double first, double second) {
                return  first + second;
            }
        }*/
    Operation sub = (first, second);

    {
        Operation sub = (first, second) -> first * second;
        System.out.println(sub);

        Operation del = (five, six) -> {
            for (!(six == 0)) {
                Operation del = five / six;
                System.out.println(del);
            }
            return;


        private static void printOperationResult (Operation Operation operation;
        operation (double a, double b) {
        System.out.println(operation.action(a, b));
    }

        Operation min = (a, b) -> a < b ? a : b;
        void printOperationResult (min, 12.3, 9.9);
        printOperationResult((a, b) -> a > b ? a : b, 12.3, 9.9);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(875. - 78, 12, 56, 34));
        //Predicate<T>: boolean test(T t)
        Predicate<Integer> negative = elem ->
                integers.removeIf(negative);
        integers.removeIf(integer -> integer == 1000);

        Serializable properties;
        ArrayList<String> files = new ArrayList<>(Arrays.asList("01.txt", "02.json", "04.txt", 05.properties));
        files.removeIf(string -> !(string.endsWith(".json") || string.endsWith(".properties")));

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 5));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 80, 12));
        fruits.add(new Fruit(Fruit.FruitType.APRICOT, 300, 2));
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 10));

        fruits.removeIf(fruit -> fruit.getType() == Fruit.FruitType.BANANA && fruit.getPrice() < 100);

        /*fruits.forEach fruit {
        if (fruit.getType() == Fruit.FruitType.BANANA && fruit.getType() == Fruit.FruitType.APPLE) {
            System.out.println(fruits.getPrice());*/
    }



/*ArrayList<Fruit> fruitArrayList = new ArrayList<>();
Predicate<Fruit> fruitFilter = ;
ArrayList<SubFruit> subFruitArrayList = new ArrayList<>();
Predicate<SubFruit> subFruitFilter = ;

ArrayList<Fruit> frFiltered = fruitsByFilter(fruitArrayList, fruitFilter);
ArrayList<SubFruit> subFrFiltered = /*


//@Override
//    public void forEach(Consumer<? super E> action) {
//        Objects.requireNonNull(action);
//        final int expectedModCount = modCount;
//        final Object[] es = elementData;
//        final int size = this.size;
//        for (int i = 0; modCount == expectedModCount && i < size; i++)
//            action.accept(elementAt(es, i));
//        if (modCount != expectedModCount)
//            throw new ConcurrentModificationException();
    }