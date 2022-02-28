package main.creational.singleton;

import main.creational.pojo.MyObject;

public class MyObjectSingleton {
    public static final MyObject myObject = new MyObject(0L, "Singleton");

    public static MyObject getInstance() {
        return myObject;
    }
}
