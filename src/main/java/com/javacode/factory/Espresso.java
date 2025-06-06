package com.javacode.factory;

public class Espresso implements Coffee {

    @Override
    public void prepare() {
        System.out.println("Preparing Espresso");
    }
}
