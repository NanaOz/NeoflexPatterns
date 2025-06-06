package com.javacode.proxy;


public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String dbName;
    private static final String URL = "localhost:5432/";

    public DatabaseProxy(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        if (realDatabase == null) {
            realDatabase = new RealDatabase(URL + dbName);
        }
        realDatabase.connect();
    }
}
