package com.company.project.lesson08;
/*### Задача #1

Дополнить иерархию транспортных средств классом Машина:

1. Машина наследуется от Транспортного средства и расширяет его свойством String color со значением по умолчанию -
   белый.
2. В классе добавить возможность изменения цвета.
3. Необходимо реализовать класс таким образом, чтобы значение по умолчанию для максимальной скорости было рано 240.
4. Реализация метода repair: уменьшение уровня износа на 1, но не меньше 0 */
public class Car extends Vehicle {

        private String color = "белый";

    public Car(String number) {
        super(number);
        super.maxSpeed = 240;
    }
    public Car(String number, int maxSpeed) {
        super(number, maxSpeed);
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }

    public Car(String number, int maxSpeed, String color) {
        super(number, maxSpeed);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}


