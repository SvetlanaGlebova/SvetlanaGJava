package com.company.project.lesson22.less2Homework;

public class ConsoleWriter implements UppLoggerTask {

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
