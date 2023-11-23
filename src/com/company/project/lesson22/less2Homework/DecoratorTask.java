package com.company.project.lesson22.less2Homework;

public class DecoratorTask {
        public static void main(String[] args) {

UppLoggerTask logger01 = new Delimiter(new Upper(new ConsoleWriter()));
UppLoggerTask logger02 = new Upper(new ConsoleWriter());
UppLoggerTask logger03 = new ConsoleWriter();
    }
}
