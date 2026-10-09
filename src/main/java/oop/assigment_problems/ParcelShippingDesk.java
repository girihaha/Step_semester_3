package oop.assigment_problems;

abstract class Parcel {
    String type;
    double weightKg;
    double declaredValue;

    Parcel(String type, double weightKg, double declaredValue) {
        this.type = type;
        this.weightKg = weightKg;
        this.declaredValue = declaredValue;
    }

    abstract double getShippingCharge();
    abstract double getInsurance();

    double getTotal() {
        return getShippingCharge() + getInsurance();
    }
}

class StandardParcel extends Parcel {
    StandardParcel(double weightKg, double declaredValue) { super("STANDARD", weightKg, declaredValue); }
    double getShippingCharge() { return 40.0 + (weightKg * 10.0); }
    double getInsurance() { return 0.0; }
}

class ExpressParcel extends Parcel {
    ExpressParcel(double weightKg, double declaredValue) { super("EXPRESS", weightKg, declaredValue); }
    double getShippingCharge() { return 80.0 + (weightKg * 15.0); }
    double getInsurance() { return declaredValue * 0.02; }
}

class FragileParcel extends Parcel {
    FragileParcel(double weightKg, double declaredValue) { super("FRAGILE", weightKg, declaredValue); }
    double getShippingCharge() { return 40.0 + (weightKg * 10.0) + 50.0; }
    double getInsurance() { return declaredValue * 0.02; }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel[] parcels = {
            new StandardParcel(3.0, 500.0),
            new ExpressParcel(2.0, 1000.0),
            new FragileParcel(1.5, 2000.0)
        };

        double grandTotal = 0;
        for (Parcel p : parcels) {
            double charge = p.getShippingCharge();
            double ins = p.getInsurance();
            double total = p.getTotal();
            grandTotal += total;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n", p.type, charge, ins, total);
        }
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
