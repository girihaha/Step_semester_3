package oop.class_problems;

public class ProductCatalog {
    int productId;
    String productName;
    double price;

    public ProductCatalog(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("ID: " + productId + " | Item: " + productName + " | Price: Rs " + price);
    }

    public static void main(String[] args) {
        ProductCatalog p1 = new ProductCatalog(101, "Wireless Mouse", 499.0);
        ProductCatalog p2 = new ProductCatalog(102, "Mechanical Keyboard", 1899.0);
        p1.displayProduct();
        p2.displayProduct();
    }
}
