package com.company.project.lesson1516;

import com.company.project.lesson09.Point;

public class Pont implements Comparable<Point>{
    //сортировка по возрастанию
    //сортировка по убыванию
    //сортировка не по убыванию
    //сортировка не по возрастанию

    @Override
    public int compareTo(Point o) {


        return 0;
    }
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
