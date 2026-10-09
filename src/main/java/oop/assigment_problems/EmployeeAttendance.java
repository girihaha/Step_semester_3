package oop.assigment_problems;

public class EmployeeAttendance {
    String empId;
    String empName;
    int daysPresent;

    public EmployeeAttendance(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        this.daysPresent = 0;
    }

    public void markPresent() {
        daysPresent++;
    }

    public double getAttendancePercentage(int totalWorkingDays) {
        if (totalWorkingDays <= 0) {
            return 0.0;
        }
        return ((double) daysPresent / totalWorkingDays) * 100.0;
    }

    public static void main(String[] args) {
        EmployeeAttendance emp = new EmployeeAttendance("E104", "Girish");
        for (int i = 0; i < 20; i++) {
            emp.markPresent();
        }
        System.out.printf("Employee: %s | Attendance: %.1f%%%n", emp.empName, emp.getAttendancePercentage(22));
    }
}
