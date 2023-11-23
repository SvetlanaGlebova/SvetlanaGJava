package com.company.project.lesson22.less2Homework;

public class DecoratorTask {
        public static void main(String[] args) {

AppLoggerTask logger01 = new Delimiter(new Upper(new ConsoleWriter()));
AppLoggerTask logger02 = new Upper(new ConsoleWriter());
AppLoggerTask logger03 = new ConsoleWriter();
    }
}
