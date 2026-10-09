package oop.class_problems;

abstract class Staff {
    String name;
    Staff(String name) { this.name = name; }
    abstract double calculatePay();
}

class FullTimeStaff extends Staff {
    double weeklySalary;
    FullTimeStaff(String name, double weeklySalary) { super(name); this.weeklySalary = weeklySalary; }
    double calculatePay() { return weeklySalary; }
}

class HourlyStaff extends Staff {
    double hourlyRate;
    double hoursWorked;
    HourlyStaff(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculatePay() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            return (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
    }
}

class InternStaff extends Staff {
    double stipend;
    InternStaff(String name, double stipend) { super(name); this.stipend = stipend; }
    double calculatePay() { return stipend; }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Staff[] staffList = {
            new FullTimeStaff("Arun", 25000.0),
            new HourlyStaff("Sneha", 500.0, 45.0),
            new InternStaff("Girish", 8000.0)
        };

        double totalPayroll = 0;
        for (Staff s : staffList) {
            double pay = s.calculatePay();
            totalPayroll += pay;
            System.out.printf("%s: %.2f%n", s.name, pay);
        }
        System.out.printf("Total Payroll: %.2f%n", totalPayroll);
    }
}
