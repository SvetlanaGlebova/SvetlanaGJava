package com.company.project.lesson27.homework;

/*Даны 4 файла с текстовой информацией.
Строки в файлах имеют следующий вид: дата и время::приоритет::информация о событии
Приоритет - целочисленное значение от 1 до 10, где 10 - наивысший приоритет.
Вывести в консоль информацию о событиях с приоритетом 7 и выше.
Вывести в консоль информацию о том, сколько сообщений с приоритетом 7 и выше находилось в файле.
Каждый файл должен обрабатываться в отдельном потоке.*/
public class Homework {
    public static void main(String[] args) {
        String[] fileNames = {"file1.txt", "file2.txt", "file3.txt", "file4.txt" };

        for (String fileName : fileNames) {
            Proccesor fileProccesor = new Proccesor(fileName);
            Thread tread = new Thread(fileProccesor);
            tread.start();

        }

    }

}
