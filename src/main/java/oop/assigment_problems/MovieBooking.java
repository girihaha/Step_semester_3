package oop.assigment_problems;

public class MovieBooking {
    String movieTitle;
    int ticketsBooked;
    double pricePerTicket;

    public MovieBooking(String movieTitle, int ticketsBooked, double pricePerTicket) {
        this.movieTitle = movieTitle;
        this.ticketsBooked = ticketsBooked;
        this.pricePerTicket = pricePerTicket;
    }

    public double calculateTotal() {
        return ticketsBooked * pricePerTicket;
    }

    public static void main(String[] args) {
        MovieBooking booking = new MovieBooking("Interstellar", 3, 250.0);
        System.out.println("Movie: " + booking.movieTitle + " | Total Cost: Rs " + booking.calculateTotal());
    }
}
