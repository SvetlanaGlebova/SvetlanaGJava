package com.company.project.lesson13;

import com.company.project.lesson08.Vehicle;

public class Lesson13 {
    /*switch (s) {
        case "A" -> System.out.println("A");
        case "B" -> System.out.println("B");*/
    }
    private void pritInfo(){
        for (Vehicle vehicle : vehicles) {
            //System.out.println((Bicycle) vehicle).getNumberOfWheels());
            switch (vehicle){
                case Vehicle vehicle1 -> System.out.println((vehicle1.getNumberOfWheels()));
            }
        }
    }

}
