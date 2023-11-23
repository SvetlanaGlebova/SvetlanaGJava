package com.company.project.lesson22.less2Homework;

    public class Delimiter implements UppLoggerTask {
        private final UppLoggerTask logger;

        public Delimiter(UppLoggerTask logger) {
            this.logger = logger;
        }

        @Override
        public void log(String message) {
            logger.log("**" +message +"**");
        }
}
