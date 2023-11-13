package com.company.project.lesson1516;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Lesson16 {
    //Set:
    //1. не позволяют хранить дублирующие элементы
    //2. возможность добавить null и порядок хранения элементов
    //зависят от конкретной реализации
    //3. обязательно переопределять метод eqals - для добавления элементов

    //реализован на основе хеш-таблицы
    HashSet<Integer> integerHashSet = new HashSet<>();
    //порядок хранения элементов
    //может отличаться от порядка добавления
    integerHashSet.add(4);
    integerHashSet.remove(4);
    integerHashSet.add(6);
    integerHashSet.add(4); //false
    integerHashSet.add(7);
    integerHashSet.add(70);

   //для типов, добавляемых в TreeSet
    TreeSet<String> stringTreeSet = new TreeSet<>();
    stringTreeSet.add("1");
    stringTreeSet.add("145");
    stringTreeSet.add("45");
    //нельзя добавлять null -> упадет с ошибкой nullPoinExeption
    //должен эмплементировать Comparable-интерфейс Comparable<Integer>

    Comparator<User> byName = User.NameComparator();
    Comparator<User> bySalary = new User.SalaryComparator();

    Comparator<User> byNameThenBySalary = byName.thenComparing(bySalary);
}
