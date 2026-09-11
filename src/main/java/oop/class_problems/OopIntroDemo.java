package oop.class_problems;

class SrmStudent {
    String name;
    String regNo;
    int attendance;

    void checkExamEligibility() {
        if (attendance >= 75) {
            System.out.println(name + " (" + regNo + ") is eligible for exams.");
        } else {
            System.out.println(name + " (" + regNo + ") is not eligible for exams. Attendance is below 75%.");
        }
    }
}

public class OopIntroDemo {
    public static void main(String[] args) {
        SrmStudent s1 = new SrmStudent();
        s1.name = "Ravi";
        s1.regNo = "RA2311003010123";
        s1.attendance = 82;

        SrmStudent s2 = new SrmStudent();
        s2.name = "Anitha";
        s2.regNo = "RA2311003010124";
        s2.attendance = 68;

        s1.checkExamEligibility();
        s2.checkExamEligibility();
    }
}
