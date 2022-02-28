package main.creational.builder;

import main.creational.common.IdCounterHolder;
import main.creational.pojo.MyObject;

public class MyObjectBuilder {
    private final MyObject myObject = new MyObject();

    public static MyObjectBuilder builder() {
        IdCounterHolder.incCounter();

        return new MyObjectBuilder();
    }

    public MyObjectBuilder id(Long id) {
        myObject.setId(id);

        return this;
    }

    public MyObjectBuilder name(String name) {
        myObject.setName(name);

        return this;
    }

    public MyObject build() {
        if (myObject.getId() == null) {
            myObject.setId(IdCounterHolder.getCounter());
        }

        return myObject;
    }
}
