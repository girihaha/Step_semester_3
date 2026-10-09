package oop.assigment_problems;

public class VehicleOdometer {
    private String registrationNumber;
    private double mileage;

    public VehicleOdometer(String registrationNumber, double initialMileage) {
        this.registrationNumber = registrationNumber;
        this.mileage = Math.max(0, initialMileage);
    }

    public void addTrip(double tripKm) {
        if (tripKm > 0) {
            mileage += tripKm;
        }
    }

    public double getMileage() {
        return mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {
        VehicleOdometer car = new VehicleOdometer("TN-09-AB-1234", 15400.0);
        car.addTrip(120.5);
        car.addTrip(-50.0);
        System.out.println("Vehicle: " + car.getRegistrationNumber() + " | Odometer: " + car.getMileage() + " km");
    }
}
