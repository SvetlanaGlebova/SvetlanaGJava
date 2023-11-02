package com.company.project.lesson14;

import com.company.project.lesson08.Vehicle;

import java.security.Provider;

public class WildCard {
    //Ковариантность - сохранение иерархии наследования исходных типов
    //если машина - подтип тр срва, то и массив машин будет подтипом массива тр срв

    //Инвариантность - отсутствие наследования у подтипов. Подтипы никак друг к другу не относятся

    //Контрвариантность - изменение иерархии исходных типов на противоположную в проиводных типах
    //если Car - подтип Vehicle, то Service<Vehicle> - подтип Service<Car> и можно выполнить присваивание
    Service<Vehicle> vehicle02 = new Service<>();

    Service<Car> car03 = new Service<>();
    Service<? extends Vehicle> vehicle03 = car03;

    Service<Vehicle> vehicle04 = new Service<>();
    //ограничение снизу
    Service<? super Car>


}
