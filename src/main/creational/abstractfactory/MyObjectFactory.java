package main.creational.abstractfactory;

import main.creational.common.IdCounterHolder;
import main.creational.pojo.MyObject;

public class MyObjectFactory implements AbstractObjectFactory<MyObject> {
    @Override
    public MyObject createObject(String name) {
        IdCounterHolder.incCounter();

        return new MyObject(IdCounterHolder.getCounter(), name);
    }
}
