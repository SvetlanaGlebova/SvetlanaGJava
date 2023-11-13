package com.company.project.lesson17;

public class Transport {
    private String name;
    private int wearLevel;
    private String color;

    public String getColor() {
        return color;
    }

    public Transport(String name, int wearLevel) {
        this.name = name;
        this.wearLevel = wearLevel;
    }

    public int getWearLevel() {
        return wearLevel;
    }

    public void repair() {
        // Логика ремонта транспортного средства
        // ...
        wearLevel = 0; // Пример: после ремонта уровень износа сбрасывается на 0
    }
}
