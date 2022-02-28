package main.creational.abstractfactory;

public interface AbstractObjectFactory<T> {
    T createObject(String name);
}
