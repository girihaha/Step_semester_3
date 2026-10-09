package oop.class_problems;

abstract class LibraryItem {
    String title;
    LibraryItem(String title) { this.title = title; }
    abstract double calculateFine(int daysLate);
}

class BookItem extends LibraryItem {
    BookItem(String title) { super(title); }
    double calculateFine(int daysLate) { return daysLate * 2.0; }
}

class DvdItem extends LibraryItem {
    DvdItem(String title) { super(title); }
    double calculateFine(int daysLate) { return Math.min(daysLate * 5.0, 50.0); }
}

class MagazineItem extends LibraryItem {
    MagazineItem(String title) { super(title); }
    double calculateFine(int daysLate) { return daysLate * 1.0; }
}

public class LibraryLateFineCounter {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new BookItem("Clean Code"),
            new DvdItem("Inception"),
            new MagazineItem("Tech Monthly")
        };

        int daysLate = 12;
        double totalFine = 0;
        for (LibraryItem item : items) {
            double fine = item.calculateFine(daysLate);
            totalFine += fine;
            System.out.printf("%s: %.2f%n", item.title, fine);
        }
        System.out.printf("Total Fines: %.2f%n", totalFine);
    }
}
