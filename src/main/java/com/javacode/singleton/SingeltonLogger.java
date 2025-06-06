package com.javacode.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SingeltonLogger {
    private static SingeltonLogger logger;

    private SingeltonLogger() {
    }

    public static SingeltonLogger getInstance() {
        if (logger == null) {
            logger = new SingeltonLogger();
        }
        return logger;
    }

    public void classLogger(Object o, String info) {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
        String className = o.getClass().getSimpleName();
        System.out.println("Log info: " + date + "-" + className + "-" + info);
    }
}
