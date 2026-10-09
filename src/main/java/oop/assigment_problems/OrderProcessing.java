package oop.assigment_problems;

public class OrderProcessing {
    String orderId;
    double itemTotal;
    double taxPercent;

    public OrderProcessing(String orderId, double itemTotal, double taxPercent) {
        this.orderId = orderId;
        this.itemTotal = itemTotal;
        this.taxPercent = taxPercent;
    }

    public double getFinalBill() {
        double tax = (itemTotal * taxPercent) / 100.0;
        return itemTotal + tax;
    }

    public static void main(String[] args) {
        OrderProcessing order = new OrderProcessing("ORD-892", 1200.0, 5.0);
        System.out.printf("Order ID: %s | Final Bill: Rs %.2f%n", order.orderId, order.getFinalBill());
    }
}
