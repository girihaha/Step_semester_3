package oop.assigment_problems;

abstract class StudentFeeCategory {
    String name;
    String category;

    StudentFeeCategory(String name, String category) {
        this.name = name;
        this.category = category;
    }

    abstract double calculateFee();
}

class DayScholarStudent extends StudentFeeCategory {
    DayScholarStudent(String name) { super(name, "DAY_SCHOLAR"); }
    double calculateFee() { return 40000.0 + 12000.0; }
}

class HostellerStudent extends StudentFeeCategory {
    HostellerStudent(String name) { super(name, "HOSTELLER"); }
    double calculateFee() { return 40000.0 + 60000.0; }
}

class ScholarStudent extends StudentFeeCategory {
    ScholarStudent(String name) { super(name, "SCHOLAR"); }
    double calculateFee() { return 20000.0 + 12000.0; }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        StudentFeeCategory[] students = {
            new DayScholarStudent("Aditya"),
            new HostellerStudent("Rohan"),
            new ScholarStudent("Meera")
        };

        double totalCollected = 0;
        for (StudentFeeCategory s : students) {
            double fee = s.calculateFee();
            totalCollected += fee;
            System.out.printf("%s: %.2f%n", s.name, fee);
        }
        System.out.printf("Total Collected: %.2f%n", totalCollected);
    }
}
