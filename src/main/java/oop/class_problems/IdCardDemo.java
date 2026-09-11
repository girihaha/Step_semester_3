package oop.class_problems;

class IdCard {
    String name;
    int libraryBooks;

    IdCard(String name) {
        this.name = name;
        this.libraryBooks = 0;
    }
}

public class IdCardDemo {
    public static void main(String[] args) {
        IdCard ravi = new IdCard("Ravi");
        IdCard karthik = new IdCard("Karthik");
        IdCard duplicate = ravi;

        duplicate.libraryBooks = 3;

        System.out.println("Ravi library books: " + ravi.libraryBooks);
        System.out.println("ravi == duplicate: " + (ravi == duplicate));
        System.out.println("ravi == karthik: " + (ravi == karthik));

        IdCard lost = null;
        System.out.println("lost == null: " + (lost == null));
    }
}
