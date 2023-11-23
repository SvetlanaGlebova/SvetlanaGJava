package com.company.project.lesson22.less2Homework;

public class Upper implements AppLoggerTask {
    private final AppLoggerTask logger;

    public Upper(AppLoggerTask logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log(message.toUpperCase());
    }
}

