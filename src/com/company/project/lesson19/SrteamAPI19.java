package com.company.project.lesson19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SrteamAPI19 {
    Predicate<Integer> negative = integer -> integer < 0;
    //Function<T, R>: R apply(T t)
    Function<Integer, String> deg = integer -> integer + " deg";
    //String degRes = deg.apply(-20); // "-20 deg"
    //Consumer<T>: void accept(T t);
    Consumer<String> sout = s -> System.out.println(s);
    //sout.accept("-55 deg");

    Stream<Integer> temps = Stream.of(-560, 312, 12, -55, -100, 45, 0, 0, 23);
    temps.filter(negative) // Steam<Integer> (-560, -55, -100, -20)
            .map(deg) // Stream<Sting> ("-560 deg", "-55 deg", "-100 deg")
    .forEach(sout);


    Stream<Integer> values = Stream.of(-560, 312, 12, -55, -100, 45, 0, 0, 23);
//-оставить ько уникальные значение - distinct()
//-отрицательные значения заменить на 0 - map(Function fn)
//- отсортировать в порядке убывания - sorted(Comarator comp)
// - вывести элементы в консоль
values.distinct()
        .map(integer ->integer< 0?0:integer)
            .sorted(a, b) ->b -a)
            .forEach(integer ->System.out.println(integer));


//Дан массив строк:
String[] colors = {"white", "black", "red", "yellow", "yellowgreen",};
//создать строку - Arrays.stream()
//оставить цвета, не содержащие желтый - filter(Predicate p)
//вывести в консоль количество элементов потока - long count()

long count = Arrays.stream(colors);
 .filter(colors -> !colors.contains("yellow"))
            .count()
        System.out.println(count);