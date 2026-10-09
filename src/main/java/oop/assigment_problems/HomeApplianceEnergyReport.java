package oop.assigment_problems;

abstract class Appliance {
    String name;
    double wattage;
    boolean supportsSaver;

    Appliance(String name, double wattage, boolean supportsSaver) {
        this.name = name;
        this.wattage = wattage;
        this.supportsSaver = supportsSaver;
    }

    void calculateEnergy(double hours, boolean isSaver) {
        if (isSaver && !supportsSaver) {
            System.out.println(name + ": saver mode not supported");
            return;
        }

        double units = (wattage * hours) / 1000.0;
        if (isSaver && supportsSaver) {
            units *= 0.75;
        }

        double cost = units * 8.0;
        System.out.printf("%s: Units=%.2f Cost=%.2f%n", name, units, cost);
    }
}

class Fridge extends Appliance { Fridge() { super("FRIDGE", 150.0, false); } }
class AirConditioner extends Appliance { AirConditioner() { super("AC", 1500.0, true); } }
class Television extends Appliance { Television() { super("TV", 100.0, false); } }
class WashingMachine extends Appliance { WashingMachine() { super("WASHER", 500.0, true); } }

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Appliance[] apps = {
            new Fridge(),
            new AirConditioner(),
            new Television(),
            new WashingMachine()
        };

        for (Appliance a : apps) {
            a.calculateEnergy(5.0, true);
        }
    }
}
