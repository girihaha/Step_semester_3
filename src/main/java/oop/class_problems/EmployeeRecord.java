package oop.class_problems;

public class EmployeeRecord {
    private String empId;
    private String name;
    private double basicSalary;
    private double deductions;

    public EmployeeRecord(String empId, String name, double basicSalary, double deductions) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.deductions = deductions;
    }

    public double getNetSalary() {
        return basicSalary - deductions;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        EmployeeRecord emp = new EmployeeRecord("EMP-204", "Girish", 65000.0, 4500.0);
        System.out.println("ID: " + emp.getEmpId() + " | Name: " + emp.getName() + " | Net: Rs " + emp.getNetSalary());
    }
}
