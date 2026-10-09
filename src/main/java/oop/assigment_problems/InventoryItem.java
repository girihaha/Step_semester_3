package oop.assigment_problems;

public class InventoryItem {
    private String sku;
    private int quantity;
    private final int reorderLevel;

    public InventoryItem(String sku, int quantity, int reorderLevel) {
        this.sku = sku;
        this.quantity = Math.max(0, quantity);
        this.reorderLevel = reorderLevel;
    }

    public void addStock(int qty) {
        if (qty > 0) {
            quantity += qty;
        }
    }

    public boolean dispatchStock(int qty) {
        if (qty > 0 && qty <= quantity) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    public boolean isReorderNeeded() {
        return quantity <= reorderLevel;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        InventoryItem item = new InventoryItem("SKU-99", 50, 20);
        item.dispatchStock(35);
        System.out.println("Current Stock: " + item.getQuantity() + " | Reorder Needed: " + item.isReorderNeeded());
    }
}
