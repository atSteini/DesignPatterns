package main.creational.prototype;

import main.creational.pojo.MyObject;

public class MyObjectPrototype extends ObjectPrototype {
    MyObject myObject;

    public MyObjectPrototype(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public MyObject clone() {
        return new MyObject(myObject.getId(), myObject.getName());
    }
}
