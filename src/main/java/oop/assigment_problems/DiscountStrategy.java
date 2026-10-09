package oop.assigment_problems;

interface DiscountPolicy {
    double applyDiscount(double amount);
}

class FestiveDiscount implements DiscountPolicy {
    public double applyDiscount(double amount) {
        return amount * 0.85;
    }
}

class MemberDiscount implements DiscountPolicy {
    public double applyDiscount(double amount) {
        return amount * 0.90;
    }
}

public class DiscountStrategy {
    public static void main(String[] args) {
        DiscountPolicy d1 = new FestiveDiscount();
        DiscountPolicy d2 = new MemberDiscount();
        System.out.println("Festive (Rs 1000): " + d1.applyDiscount(1000.0));
        System.out.println("Member (Rs 1000): " + d2.applyDiscount(1000.0));
    }
}
