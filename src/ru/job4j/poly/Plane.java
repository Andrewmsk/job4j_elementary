package ru.job4j.poly;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Plane start moving");
    }

    public void dropFuel() {
        System.out.println("Fuel dropped");
    }
}
