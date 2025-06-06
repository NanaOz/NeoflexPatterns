package com.javacode.factory;

public class Americano implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano");
    }
}
