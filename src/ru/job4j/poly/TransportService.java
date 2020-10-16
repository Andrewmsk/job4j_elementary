package ru.job4j.poly;

public class TransportService {

    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle[] vehicles = {bus, train,plane};
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
//        Plane newPlane = (Plane) plane;
//        newPlane.dropFuel();
    }
}
