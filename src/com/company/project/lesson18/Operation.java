package com.company.project.lesson18;

public interface Operation {
    double action(double a, double b);
default Operation addOperation(Operation other) {
    //double action(double a, double b);
    return (a, b) -> action(a, b) + other.action(a, b);
}
//объекты, создание через лямбда, можно передавать в методы,
    //как любые другие экземпляры
}
