package com.company.project.lesson08;

import java.util.Arrays;
import java.util.Random;
/*1. реализовать добавление транспортных средств в массив
2. добавить свойство `private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};`
3. изменить реализацию метода `repairAll`:
   1) после ремонта машины менять её цвет на произвольный из массива colors
   2) после ремонта ссылку на транспортное средство необходимо обнулять
    */

public class RepairShop {
    public static void main(String[] args) {
        RepairShop shop = new RepairShop();
        shop.addToVehicles(new Car("11"));
    shop.repairAll();
    }

    // в массив можно добавить тип Vehicle и все его подтипы
    private Vehicle[] vehicles = new Vehicle[4];
    private int i = 0;
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};

    public void addToVehicles(Vehicle vehicle) {

        if (i < this.vehicles.length) {
            this.vehicles[i] = vehicle;
        }
        i++;
    }

    public void repairAll() {
        Random random = new Random();
        for (Vehicle vehicle : vehicles) {
            // для вызова доступны только методы супертипа, т.е. Vehicle
            // но будет использована реализация конкретного подтипа
            vehicle.stop();
            vehicle.repair();
            // оператор instanceof вернет true,
            // если экземпляр (слева) принадлежит указанному справа типу

            if (vehicle instanceof Car) {
                int index = random.nextInt(0, this.colors.length);
                Car car = (Car) vehicle;
                car.setColor(this.colors[index]);
                vehicle = null;
                System.out.println(Arrays.toString(vehicles));
            }

            // проверка на принадлежность типу + приведение
            // аналогично предыдущей записи
            /*if (vehicle instanceof Train) {
                vehicle.stop();
                vehicle.repair();
            }

             */
            /*Random random = new Random();
            if (vehicle instanceof Colorable colorable) {
                colorable.setColor(colors[random.nextInt(colors.lenght)]);
                for (int i = 0; i < vehicle.lenght; i++) {
                    if (vehicle[i] == car) {
                        vehicle[i] = null;*/


        }
    }

}

