package oop.assigment_problems;

abstract class MovieSeat {
    String type;
    int count;
    final double convenienceFee = 20.0;

    MovieSeat(String type, int count) {
        this.type = type;
        this.count = count;
    }

    abstract double getBasePrice();

    double calculateTotal() {
        return (getBasePrice() + convenienceFee) * count;
    }
}

class RegularSeat extends MovieSeat {
    RegularSeat(int count) { super("REGULAR", count); }
    double getBasePrice() { return 150.0; }
}

class PremiumSeat extends MovieSeat {
    PremiumSeat(int count) { super("PREMIUM", count); }
    double getBasePrice() { return 250.0; }
}

class ReclinerSeat extends MovieSeat {
    ReclinerSeat(int count) { super("RECLINER", count); }
    double getBasePrice() { return 400.0; }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        MovieSeat[] bookings = {
            new RegularSeat(2),
            new PremiumSeat(1),
            new ReclinerSeat(1)
        };

        double grandTotal = 0;
        for (MovieSeat b : bookings) {
            double total = b.calculateTotal();
            grandTotal += total;
            System.out.printf("%s: %.2f%n", b.type, total);
        }
        System.out.printf("Total: %.2f%n", grandTotal);
    }
}
