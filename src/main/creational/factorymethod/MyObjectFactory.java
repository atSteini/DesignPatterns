package main.creational.factorymethod;

import main.creational.common.IdCounterHolder;
import main.creational.pojo.MyObject;

public class MyObjectFactory extends ObjectFactory {
    @Override
    public MyObject createObject(String name) {
        IdCounterHolder.incCounter();

        return new MyObject(IdCounterHolder.getCounter(), name);
    }
}
