package oop.assigment_problems;

public class ShoppingCart {
    private double totalPrice;
    private int itemCount;

    public ShoppingCart() {
        this.totalPrice = 0.0;
        this.itemCount = 0;
    }

    public void addItem(double price) {
        if (price > 0) {
            totalPrice += price;
            itemCount++;
        }
    }

    public double getDiscountedTotal(double discountPercent) {
        if (discountPercent < 0) {
            discountPercent = 0;
        }
        if (discountPercent > 50) {
            discountPercent = 50;
        }
        return totalPrice - (totalPrice * discountPercent / 100.0);
    }

    public int getItemCount() {
        return itemCount;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(1500.0);
        cart.addItem(2500.0);
        System.out.println("Items: " + cart.getItemCount() + " | Final after 20% discount: Rs " + cart.getDiscountedTotal(20));
    }
}
