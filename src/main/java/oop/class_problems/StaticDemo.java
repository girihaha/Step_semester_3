package oop.class_problems;

class UniversityStudent {
    String name;
    String regNo;
    static String university = "SRM Institute of Science and Technology";
    static String campus = "SRM Kattankulathur";
    static int admissionCount = 0;

    UniversityStudent(String name) {
        this.name = name;
        admissionCount++;
        this.regNo = "RA23110030101" + admissionCount;
    }

    void printIdCard() {
        System.out.println(regNo + " | " + name + " | " + campus);
    }

    static void printTotalAdmissions() {
        System.out.println("Students admitted so far: " + admissionCount);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        UniversityStudent ravi = new UniversityStudent("Ravi");
        UniversityStudent meera = new UniversityStudent("Meera");

        ravi.printIdCard();
        meera.printIdCard();

        UniversityStudent.printTotalAdmissions();

        UniversityStudent.campus = "SRM Ramapuram";
        ravi.printIdCard();
        meera.printIdCard();
    }
}
