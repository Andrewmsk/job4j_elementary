package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Start drive");
    }

    @Override
    public void setPassengers(int passengers) {
        System.out.println(String.format("Load %s passengers", passengers));
    }

    @Override
    public float loadFuel(int liter) {
        return liter * 48.5f;
    }

    @Override
    public void move() {
        System.out.println("Bus start moving");
    }
}
