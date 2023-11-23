package com.company.project.lesson22.less2Homework;

    public class Delimiter implements AppLoggerTask {
        private final AppLoggerTask logger;

        public Delimiter(AppLoggerTask logger) {
            this.logger = logger;
        }

        @Override
        public void log(String message) {
            logger.log("**" +message +"**");
        }
}
