package com.company.project.lesson14;

public class PairContainer<K, V> {
    private K key;
    private V value;

    /* 1.Создать экземпляр `PairContainer`, где key - любые числа, value - строка
3. Создать экземпляр `PairContainer`, где key - строка, value - тип User, у которого id - любые числа
4. Создать экземпляр `PairContainer`, где key - строка, value - тип PairContainer, у которого key - любые числа,
   value - тип User, у которого id - строка*/


    public static void main(String[] args) {
        PairContainer<Number, String> pairContainer01 = new PairContainer<>();
        PairContainer<String, User<Number>> pairContainer02 = new PairContainer<>();
        PairContainer<String, PairContainer<Number, User<String>>> pairConteiner03 =
                new PairContainer<>();
    }
}
