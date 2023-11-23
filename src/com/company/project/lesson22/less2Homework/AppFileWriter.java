package com.company.project.lesson22.less2Homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppFileWriter implements AppLoggerTask {
private final String fileName;

    public AppFileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {

        try {
            Files.writeString(Paths.get(fileName), message, StandardOpenOption.APPEND);
            // "данные" будут записаны в конец (StandardOpenOption.APPEND) файла "file-name.txt"
        } catch (
                IOException e) {
            System.out.println("Данные не были записаны");
        }
    }
}
