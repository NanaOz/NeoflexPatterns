package com.javacode;

import com.javacode.factory.Coffee;
import com.javacode.factory.CoffeeFactory;
import com.javacode.singleton.SingeltonLogger;

public class Main {
    public static void main(String[] args) {
        // Singltone
        SingeltonLogger logger = SingeltonLogger.getInstance();
        logger.classLogger(new Main(), "Some info");

        //Factory
        Coffee expresso = CoffeeFactory.createCoffee("espresso");
        expresso.prepare();

        Coffee americano = CoffeeFactory.createCoffee("americano");
        americano.prepare();

        //Adapter

        //Proxy
    }
}