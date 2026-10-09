package oop.assigment_problems;

abstract class TaxScheme {
    abstract double computeTax(double income);
}

class OldTaxScheme extends TaxScheme {
    double computeTax(double income) {
        if (income > 500000) {
            return (income - 500000) * 0.20;
        }
        return 0.0;
    }
}

class NewTaxScheme extends TaxScheme {
    double computeTax(double income) {
        if (income > 700000) {
            return (income - 700000) * 0.15;
        }
        return 0.0;
    }
}

public class TaxCalculator {
    public static void main(String[] args) {
        TaxScheme s1 = new OldTaxScheme();
        TaxScheme s2 = new NewTaxScheme();
        System.out.println("Old Scheme Tax (8L): Rs " + s1.computeTax(800000.0));
        System.out.println("New Scheme Tax (8L): Rs " + s2.computeTax(800000.0));
    }
}
