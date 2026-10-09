package oop.class_problems;

abstract class Vehicle {
    String model;
    Vehicle(String model) { this.model = model; }
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    Car(String model) { super(model); }
    double calculateRent(int days) { return days * 1500.0; }
}

class Bike extends Vehicle {
    Bike(String model) { super(model); }
    double calculateRent(int days) { return days * 500.0; }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Honda City");
        Vehicle v2 = new Bike("Royal Enfield");
        System.out.println(v1.model + " (3 days): Rs " + v1.calculateRent(3));
        System.out.println(v2.model + " (5 days): Rs " + v2.calculateRent(5));
    }
}
