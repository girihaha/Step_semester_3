package oop.class_problems;

public class HostelAllocation {
    String roomNo;
    int capacity;
    int currentStudents;

    public HostelAllocation(String roomNo, int capacity) {
        this.roomNo = roomNo;
        this.capacity = capacity;
        this.currentStudents = 0;
    }

    public boolean allocateStudent(String studentName) {
        if (currentStudents < capacity) {
            currentStudents++;
            System.out.println("Allocated " + studentName + " to Room " + roomNo);
            return true;
        }
        System.out.println("Room " + roomNo + " is full.");
        return false;
    }

    public static void main(String[] args) {
        HostelAllocation room = new HostelAllocation("B-101", 2);
        room.allocateStudent("Rohan");
        room.allocateStudent("Siddharth");
        room.allocateStudent("Aman");
    }
}
