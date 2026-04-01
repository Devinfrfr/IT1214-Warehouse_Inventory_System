public class Item {
    private int itemId;
    private String itemName;
    private int quantity;
    private double price;

    public Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "ID: " + itemId + " | Name: " + itemName + " | Qty: " + quantity + " | Price: " + price;
    }
}