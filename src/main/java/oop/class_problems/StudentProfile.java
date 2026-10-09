package oop.class_problems;

public class StudentProfile {
    private String regNo;
    private String name;
    private int[] marks;

    public StudentProfile(String regNo, String name, int[] marks) {
        this.regNo = regNo;
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public static void main(String[] args) {
        int[] m = {85, 90, 78, 92, 88};
        StudentProfile s = new StudentProfile("RA2311003", "Girish", m);
        System.out.printf("Student: %s (%s) | Average: %.2f%n", s.getName(), s.getRegNo(), s.calculateAverage());
    }
}
