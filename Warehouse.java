import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n1. Add\n2. Remove\n3. Update\n4. Search\n5. View All\n6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID (number): "); int id = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Qty: "); int qty = sc.nextInt();
                System.out.print("Price: "); double price = sc.nextDouble();
                inventory.addItem(new Item(id, name, qty, price));
            } else if (choice == 2) {
                System.out.print("ID to remove: ");
                inventory.removeItem(sc.nextInt());
            } else if (choice == 3) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("New Qty: ");
                inventory.updateQuantity(id, sc.nextInt());
            } else if (choice == 4) {
                System.out.print("Search ID: ");
                inventory.searchItem(sc.nextInt());
            } else if (choice == 5) {
                inventory.displayAll();
            }
        }
        sc.close();
    }
}