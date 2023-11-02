package com.company.project.lesson11;

import java.sql.SQLOutput;
import java.util.Arrays;

public class lesson11 {
    public static void main(String[] args) {
        Country france = Country.FRANCE;
        Article article = new Article(Country.ITALY);
        //сравнивать перечисления можно через ==
        System.out.println(france == article.getCountry());
        //реализация ананлогична сравнению через ==
        System.out.println(france.equals(article.getCountry()));

        //методы перечислений
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));

        System.out.println(Country.USA.ordinal());//1
        System.out.println(france.name());
        System.out.println(france/*.toString()*/);
    }
}
