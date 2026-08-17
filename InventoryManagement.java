import java.util.ArrayList;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.printf(
            "%-5d %-15s %-10d ₹%.2f%n",
            id, name, quantity, price
        );
    }
}

public class InventoryManagement {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Keyboard", 20, 1200));
        products.add(new Product(102, "Mouse", 35, 700));
        products.add(new Product(103, "Monitor", 10, 8500));

        System.out.printf(
            "%-5s %-15s %-10s %s%n",
            "ID", "Product", "Quantity", "Price"
        );

        System.out.println("-----------------------------------------");

        for (Product product : products) {
            product.display();
        }
    }
}
