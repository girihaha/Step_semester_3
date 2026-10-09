package oop.class_problems;

abstract class TravelBookingBase {
    String mode;
    final double bookingFee = 50.0;

    TravelBookingBase(String mode) { this.mode = mode; }
    abstract double getBaseFare(double km);

    double calculateTotalFare(double km) {
        return getBaseFare(km) + bookingFee;
    }
}

class BusBooking extends TravelBookingBase {
    BusBooking() { super("BUS"); }
    double getBaseFare(double km) { return km * 2.0; }
}

class TrainBooking extends TravelBookingBase {
    TrainBooking() { super("TRAIN"); }
    double getBaseFare(double km) { return km * 1.5; }
}

class FlightBooking extends TravelBookingBase {
    FlightBooking() { super("FLIGHT"); }
    double getBaseFare(double km) { return 2500.0 + (km * 4.0); }
}

public class TravelBooking {
    public static void main(String[] args) {
        TravelBookingBase[] bookings = {
            new BusBooking(),
            new TrainBooking(),
            new FlightBooking()
        };

        double distance = 100.0;
        for (TravelBookingBase b : bookings) {
            System.out.printf("%s: %.2f%n", b.mode, b.calculateTotalFare(distance));
        }
    }
}
