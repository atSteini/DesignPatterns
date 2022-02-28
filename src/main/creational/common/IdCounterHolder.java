package main.creational.common;

public class IdCounterHolder {
    private static Long idCounter = 0L;

    public static void incCounter() {
        idCounter++;
    }

    public static Long getCounter() {
        return idCounter;
    }
}
