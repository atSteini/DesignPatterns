package main.creational;

import main.creational.abstractfactory.MyObjectFactory;
import main.creational.builder.MyObjectBuilder;
import main.creational.common.IdCounterHolder;
import main.creational.pojo.MyObject;
import main.creational.prototype.MyObjectPrototype;
import main.creational.singleton.MyObjectSingleton;

public class CreationalPatterns {
    public static void main(String[] args) {
        //Standard
        IdCounterHolder.incCounter();
        MyObject usingStandard = new MyObject(IdCounterHolder.getCounter(), "Standard");
        System.out.printf("Standard creation: %s\n", usingStandard);

        //Builder
        MyObject usingBuilder = MyObjectBuilder.builder()
                .name("Builder")
                .build();
        System.out.printf("Builder creation: %s\n", usingBuilder);

        //AbstractFactory
        MyObject usingAbstractFactory = new MyObjectFactory()
                .createObject("AbstractFactory");
        System.out.printf("Abstract Factory creation: %s\n", usingAbstractFactory);

        //Factory Method
        MyObject usingFactoryMethod = new main.creational.factorymethod.
                MyObjectFactory().createObject("Factory Method");
        System.out.printf("Factory Method creation: %s\n", usingFactoryMethod);

        //Prototype
        MyObject usingPrototype = new MyObjectPrototype(usingStandard).clone();
        System.out.printf("Prototype creation: %s\n", usingPrototype);

        //Singleton
        MyObject usingSingleton = MyObjectSingleton.getInstance();
        System.out.printf("Singleton creation: %s\n", usingSingleton);
    }
}
