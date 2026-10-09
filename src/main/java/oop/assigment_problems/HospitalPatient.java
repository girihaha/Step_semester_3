package oop.assigment_problems;

public class HospitalPatient {
    String patientId;
    String name;
    int age;
    String assignedDoctor;

    public HospitalPatient(String patientId, String name, int age, String assignedDoctor) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.assignedDoctor = assignedDoctor;
    }

    public void displayPatientDetails() {
        System.out.println("ID: " + patientId + " | Name: " + name + " | Age: " + age + " | Doctor: " + assignedDoctor);
    }

    public static void main(String[] args) {
        HospitalPatient p = new HospitalPatient("P301", "Ramesh", 45, "Dr. Sharma");
        p.displayPatientDetails();
    }
}
