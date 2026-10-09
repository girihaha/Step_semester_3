package oop.class_problems;

abstract class ElectricityConnection {
    String type;
    ElectricityConnection(String type) { this.type = type; }
    abstract double calculateBill(int units);
}

class HomeConnection extends ElectricityConnection {
    HomeConnection() { super("HOME"); }
    double calculateBill(int units) {
        if (units <= 100) {
            return units * 5.0;
        } else {
            return (100 * 5.0) + ((units - 100) * 7.0);
        }
    }
}

class ShopConnection extends ElectricityConnection {
    ShopConnection() { super("SHOP"); }
    double calculateBill(int units) {
        return (units * 8.0) + 100.0;
    }
}

class FactoryConnection extends ElectricityConnection {
    FactoryConnection() { super("FACTORY"); }
    double calculateBill(int units) {
        double cost = units * 6.0;
        return Math.max(cost, 1000.0);
    }
}

public class ElectricityBilling {
    public static void main(String[] args) {
        ElectricityConnection[] conns = {
            new HomeConnection(),
            new ShopConnection(),
            new FactoryConnection()
        };

        int units = 150;
        double totalBill = 0;
        for (ElectricityConnection c : conns) {
            double bill = c.calculateBill(units);
            totalBill += bill;
            System.out.printf("%s: %.2f%n", c.type, bill);
        }
        System.out.printf("Total: %.2f%n", totalBill);
    }
}
