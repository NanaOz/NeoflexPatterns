package com.javacode;

import com.javacode.adapter.Computer;
import com.javacode.adapter.MemoryCard;
import com.javacode.adapter.MemoryCardAdapter;
import com.javacode.adapter.USB;
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
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        USB adapter = new MemoryCardAdapter(memoryCard);

        computer.readUSB(adapter);

        //Proxy
    }
}