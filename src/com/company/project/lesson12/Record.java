package com.company.project.lesson12;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Record(long id, String text, LocalDateTime createdAt) {
    //тело записи

    //нельзя объявлять не static поля

    //можно написать реализацию канонического конструктора

    public Record {
        if (id < 0 || text.trim().length() < 5 || createdAt == null)
            throw new IllegalArgumentException("Переданы невалидные данные");
        //по умолчанию инициализирует значение всех свойств
    }
    //можно перегрузить контрукторы,
    //но в них необходимо вызвать один из объявленных
    public Record(String text){
        this(0, text);
    }
    public Record(long id, String text){
        this(id, text, null);
    }
    //можно объявлять собвтенные методы (статические и нет)
}
//не могут наследоваться
//не могут иметь наследников (final)
//могут имплементировтаь интерфейсы, включая sealed
//могут быть вложенными и могут иметь вложенные записи
//могут объявляться с generic типами

//1. private final поля - названия и типы, как у компонентов заголовка
//2. канонический (canonical) конструктор - принимает и инициализирует значение всех свойств


