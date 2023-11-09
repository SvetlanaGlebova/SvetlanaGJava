package com.company.project.lesson17;

import com.company.project.lesson08.Car;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HomeWork {
    public List <Transport> getListOfTransport(Map <Integer, Transport> transports, int level) {
     List <Transport> newList = new ArrayList<>();
     for (Transport transport : transports.values()) {
         if (transport.getWearLevel() > level) {
            newList.add(transport);
         }

     }
     return newList;

    }
    public void fillColorMap(List<Transport> repaintObjects, Map<String, List<Transport>> colorMap) {
        // Перебираем цвета из списка покраски
        for (String color : colorMap.keySet()) {
            // Получаем список объектов для данного цвета
            List<Transport> objectsByColor = colorMap.get(color);

            // Добавляем в список объекты из списка покрашенных объектов, если они нужного цвета
            for (Transport transport : repaintObjects) {
                // Предположим, что у объекта есть метод getColor(), возвращающий его текущий цвет
                // Если цвет объекта совпадает с текущим цветом в итерации, добавляем его в список объектов для данного цвета
                if (transport.getColor().equals(color)) {
                    objectsByColor.add(transport);
                }
            }
        }

}

}
