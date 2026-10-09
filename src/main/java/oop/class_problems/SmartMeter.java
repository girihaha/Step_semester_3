package oop.class_problems;

public class SmartMeter {
    private String meterId;
    private double currentReading;

    public SmartMeter(String meterId, double initialReading) {
        this.meterId = meterId;
        this.currentReading = Math.max(0, initialReading);
    }

    public void addReading(double units) {
        if (units > 0) {
            currentReading += units;
        }
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public String getMeterId() {
        return meterId;
    }

    public static void main(String[] args) {
        SmartMeter meter = new SmartMeter("MTR-881", 120.0);
        meter.addReading(45.5);
        meter.addReading(-10.0);
        System.out.println("Meter: " + meter.getMeterId() + " | Reading: " + meter.getCurrentReading() + " units");
    }
}
