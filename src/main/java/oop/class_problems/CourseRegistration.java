package oop.class_problems;

public class CourseRegistration {
    String studentName;
    String courseCode;
    int credits;

    public CourseRegistration(String studentName, String courseCode, int credits) {
        this.studentName = studentName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void displayRegistration() {
        System.out.println("Student: " + studentName + " | Course: " + courseCode + " | Credits: " + credits);
    }

    public static void main(String[] args) {
        CourseRegistration reg1 = new CourseRegistration("Aakash", "CS201", 4);
        CourseRegistration reg2 = new CourseRegistration("Divya", "EC204", 3);
        reg1.displayRegistration();
        reg2.displayRegistration();
    }
}
