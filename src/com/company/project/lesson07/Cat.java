package com.company.project.lesson07;
//Создать класс Cat со следующими полями:
//1. имя:
//    1) не может быть меньше 3 символов, пробелы учитываться не должны
//    2) необязательное свойство
//    3) значение по умолчанию - "Мурзик"
//    4) должна быть возможность изменить значение свойства
//2. вес:
//    1) должно быть в диапазоне [1, 9)
//    2) обязательное свойство
//    3) должна быть возможность изменить значение свойства
//3. количество побед:
//    1) значение свойства может меняться только в методе `attack`
//    2) должна быть возможность прочитать значение свойства
//
//В созданном классе написать реализацию метода `attack`:
//1. Метод принимает на вход экземпляр `Cat` (не может быть null ссылкой).
//2. Метод возвращает `true`, если победил нападающий кот, `false`, если победил противник.
//3. Победителем считается кот с большим весом.
//4. У победителя на 1 увеличивается значение свойства `количество побед`.

public class Cat {
       String name = "Мурзик";
    int weight;
    int winners;

    public Cat(int weight) {
        if (weight >= 1 && weight < 9){
            this.weight = weight;
        }

    }

    public Cat(String name, int weight) {
        if (name.length() >= 3 && !name.contains(" ")) {
            this.name = name;
        }
    }
    public int getWinners() {
        return winners;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public boolean attack(Cat opponent) {
        if (opponent == null){
            throw new IllegalArgumentException("Ссылка на противника не может быть null");
        }
        return this.weight > opponent.getWeight();
    }
}
