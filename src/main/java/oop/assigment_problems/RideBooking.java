package oop.assigment_problems;

public class RideBooking {
    String passengerName;
    double distanceKm;
    double ratePerKm;

    public RideBooking(String passengerName, double distanceKm, double ratePerKm) {
        this.passengerName = passengerName;
        this.distanceKm = distanceKm;
        this.ratePerKm = ratePerKm;
    }

    public double calculateFare() {
        double baseFare = 50.0;
        return baseFare + (distanceKm * ratePerKm);
    }

    public static void main(String[] args) {
        RideBooking ride = new RideBooking("Girish", 12.5, 14.0);
        System.out.println("Passenger: " + ride.passengerName + " | Fare: Rs " + ride.calculateFare());
    }
}
