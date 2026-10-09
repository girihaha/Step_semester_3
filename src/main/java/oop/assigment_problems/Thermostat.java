package oop.assigment_problems;

public class Thermostat {
    private double temperature;
    private final double minTemp = 16.0;
    private final double maxTemp = 30.0;

    public Thermostat(double initialTemp) {
        setTemperature(initialTemp);
    }

    public void setTemperature(double temp) {
        if (temp < minTemp) {
            temperature = minTemp;
        } else if (temp > maxTemp) {
            temperature = maxTemp;
        } else {
            temperature = temp;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        Thermostat t = new Thermostat(22.0);
        t.setTemperature(35.0);
        System.out.println("Capped Temp: " + t.getTemperature() + " C");
        t.setTemperature(10.0);
        System.out.println("Floored Temp: " + t.getTemperature() + " C");
    }
}
