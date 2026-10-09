package oop.class_problems;

public class LibraryCard {
    String cardNumber;
    String holderName;
    int booksBorrowed;

    public LibraryCard(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.booksBorrowed = 0;
    }

    public void borrowBook() {
        if (booksBorrowed < 4) {
            booksBorrowed++;
            System.out.println("Book issued. Total: " + booksBorrowed);
        } else {
            System.out.println("Borrowing limit reached.");
        }
    }

    public void returnBook() {
        if (booksBorrowed > 0) {
            booksBorrowed--;
            System.out.println("Book returned. Total: " + booksBorrowed);
        }
    }

    public static void main(String[] args) {
        LibraryCard card = new LibraryCard("LIB-102", "Girish");
        card.borrowBook();
        card.borrowBook();
        card.returnBook();
    }
}
