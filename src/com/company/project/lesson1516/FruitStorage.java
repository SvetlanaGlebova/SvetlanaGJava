package com.company.project.lesson1516;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* фрукты добавляются в хранилище по следующим правилам:
        fruit не может быть null
        fruit не может быть ссылкой на существующий элемент коллекции
         если в коллекции fruits уже есть фрукт с типом и ценой, как у fruit,
        увеличивать значение свойства count фрукта коллекции на значение свойства count
         добавляемого фрукта. В противном случае добавлять fruit в коллекцию fruits.
        numberOfSlots уменьшается на значение count добавляемого фрукта.
         в хранилище нельзя добавить больше numberOfSlots фруктов*/
public class FruitStorage {
    //максимальное колво фруктов
    private int numberOfSlots;
    private List<Fruit> fruits;

    //fruits, для хранения экземпляров Fruit

    public FruitStorage(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        this.fruits = new ArrayList<>();
    }

    public void addToStorage(Fruit fruit) {
        // Objects.requireNonNull(fruit)
        if (fruit == null) {
            System.out.println("Ссылка не корректна");
            return;
        }
        if (fruits.contains(fruit)) {
            int index = fruits.indexOf(fruit);
            Fruit fruit2 = fruits.get(index);
            fruit2.setCount(fruit2.getCount() + fruit.getCount());
        } else {
            if (fruits.size() < numberOfSlots) {
                fruits.add(fruit);
            } else {
                System.out.println("Коллекция переполнена");
            }

        }
    }
}
