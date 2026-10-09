package oop.class_problems;

interface PaymentMethod {
    void processPayment(double amount);
}

class UpiPayment implements PaymentMethod {
    String upiId;
    UpiPayment(String upiId) { this.upiId = upiId; }
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs " + amount + " to " + upiId);
    }
}

class CardPayment implements PaymentMethod {
    String cardNumber;
    CardPayment(String cardNumber) { this.cardNumber = cardNumber; }
    public void processPayment(double amount) {
        System.out.println("Processing Card payment of Rs " + amount + " for card " + cardNumber);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentMethod p1 = new UpiPayment("girish@upi");
        PaymentMethod p2 = new CardPayment("XXXX-XXXX-4521");
        p1.processPayment(1200.0);
        p2.processPayment(3500.0);
    }
}
