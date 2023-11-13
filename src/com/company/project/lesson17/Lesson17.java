package com.company.project.lesson17;

import java.util.*;

public class Lesson17 {
    public static void main(String[] args) {

        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("Москва", 790);
        customers.put("Ростов", 250);
        customers.put("Новгоород", 20);
        customers.put("Ростов", 250);

        System.out.println(customers.size()); //2
        System.out.println(customers.isEmpty()); //false

        if (customers.containsValue(1000)) {
            System.out.println("Значение 1000 содержится в мапе");
        }

        //коллекция значений
        Collection<Integer> customerValues = customers.values();
        //множество ключей
        Set<String> customersKeys = customers.keySet();
        //множестов пар (ключ + значение)
        Set<Map.Entry<String, Integer>> customersPairs = customers.entrySet();

    /*for (Map.Entry<String, Integer> customerPair : customersPairs) {
        ProcessEnvironment.CheckedEntry customersPair;
        System.out.println(customerPair.getKey());*/

        /*private static ArrayList<String> getCities (HashMap < String, Integer > map,int max){
            ArrayList<String> cities = new ArrayList<>();
            for (Map.Entry<String, Integer> keyValuePair : map.entrySet()) {
                if (keyValuePair.getValue() < max) {
                    cities.add(keyValuePair.getKey());

            }
            return cities;
        }
         */
        Map <Integer, Transport> transports = new HashMap<>();
        transports.put(1, new Transport("Car", 30));
        transports.put(2, new Transport("Bus", 10));
        transports.put(3, new Transport("Truck", 50));
        HomeWork homeWork1 = new HomeWork();
        System.out.println(homeWork1.getListOfTransport(transports, 40));
    }

}


