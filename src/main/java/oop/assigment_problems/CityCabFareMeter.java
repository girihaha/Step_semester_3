package oop.assigment_problems;

abstract class Cab {
    String type;
    Cab(String type) { this.type = type; }
    abstract void calculateFare(double km, boolean isNight);
}

class MiniCab extends Cab {
    MiniCab() { super("MINI"); }
    void calculateFare(double km, boolean isNight) {
        if (isNight) {
            System.out.println("MINI: night service not available");
        } else {
            double fare = Math.max(km * 10.0, 100.0);
            System.out.printf("MINI: %.2f%n", fare);
        }
    }
}

class SedanCab extends Cab {
    SedanCab() { super("SEDAN"); }
    void calculateFare(double km, boolean isNight) {
        double fare = Math.max(km * 14.0, 100.0);
        if (isNight) {
            fare *= 1.20;
        }
        System.out.printf("SEDAN: %.2f%n", fare);
    }
}

class SuvCab extends Cab {
    SuvCab() { super("SUV"); }
    void calculateFare(double km, boolean isNight) {
        double fare = Math.max(km * 18.0, 100.0);
        if (isNight) {
            fare *= 1.20;
        }
        System.out.printf("SUV: %.2f%n", fare);
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Cab[] cabs = { new MiniCab(), new SedanCab(), new SuvCab() };
        double distance = 15.0;

        for (Cab c : cabs) {
            c.calculateFare(distance, true);
        }
    }
}
