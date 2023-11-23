package com.company.project.lesson22.less2Homework;

public class Upper implements UppLoggerTask {
    private final UppLoggerTask logger;

    public Upper(UppLoggerTask logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message.toUpperCase());
    }
}

