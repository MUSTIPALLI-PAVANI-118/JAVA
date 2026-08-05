import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    double totalValue() {
        return quantity * price;
    }

    void displayProduct() {
        System.out.println("----------------------------------------");
        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Quantity        : " + quantity);
        System.out.printf("Price           : ₹%.2f%n", price);
        System.out.printf("Stock Value     : ₹%.2f%n", totalValue());
        System.out.println("----------------------------------------");
    }
}

public class InventoryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();

    static Product findProduct(int id) {
        for (Product p : products) {
            if (p.productId == id) {
                return p;
            }
        }
        return null;
    }

    static void addProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findProduct(id) != null) {
            System.out.println("Product ID Already Exists.");
            return;
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        products.add(new Product(id, name, qty, price));

        System.out.println("Product Added Successfully.");
    }

    static void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No Products Available.");
            return;
        }

        System.out.println("\n========== PRODUCT LIST ==========");

        for (Product p : products) {
            p.displayProduct();
        }
    }

    static void searchProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = findProduct(id);

        if (p != null) {
            p.displayProduct();
        } else {
            System.out.println("Product Not Found.");
        }
    }

    static void updateStock() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = findProduct(id);

        if (p == null) {
            System.out.println("Product Not Found.");
            return;
        }

        System.out.print("Enter New Quantity: ");
        p.quantity = sc.nextInt();

        System.out.print("Enter New Price: ");
        p.price = sc.nextDouble();

        System.out.println("Stock Updated Successfully.");
    }

    static void deleteProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = findProduct(id);

        if (p != null) {
            products.remove(p);
            System.out.println("Product Deleted Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    static void totalInventoryValue() {

        double total = 0;

        for (Product p : products) {
            total += p.totalValue();
        }

        System.out.printf("Total Inventory Value: ₹%.2f%n", total);
    }

    static void totalProducts() {
        System.out.println("Total Products: " + products.size());
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== INVENTORY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Stock");
            System.out.println("5. Delete Product");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Total Products");
            System.out.println("8. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    updateStock();
                    break;

                case 5:
                    deleteProduct();
                    break;

                case 6:
                    totalInventoryValue();
                    break;

                case 7:
                    totalProducts();
                    break;

                case 8:
                    System.out.println("Thank You for Using Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
