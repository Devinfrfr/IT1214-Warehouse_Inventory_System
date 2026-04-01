import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == id) {
                items.remove(i);
                return;
            }
        }
    }

    public void updateQuantity(int id, int qty) {
        for (Item item : items) {
            if (item.getItemId() == id) {
                item.setQuantity(qty);
            }
        }
    }

    public void searchItem(int id) {
        for (Item item : items) {
            if (item.getItemId() == id) {
                System.out.println(item);
            }
        }
    }

    public void displayAll() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}