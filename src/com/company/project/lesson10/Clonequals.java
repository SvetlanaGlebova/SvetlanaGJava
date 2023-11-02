package com.company.project.lesson10;

public class Clonequals {
    private String name;
    private double initialPrice;
    private double getInitialPrice;
    private double currentPrice;

    public void item(String name, double price) {
        this.name = name;
        this.initialPrice = price;
        this.currentPrice = price;
    }
    //геттеры и сеттер для currentPrice

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", initialPrice=" + initialPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }
       /* @Override
                public boolean equals(Object 0) {
            if (this == 0) return true;
            if (!(0 instaceof Item item)) return false;*/


}

