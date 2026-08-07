import java.util.ArrayList;
import java.util.Scanner;

class Product {

    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public double getTotalValue() {
        return quantity * price;
    }

    public void updateProduct(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("-------------------------------------------");
        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Price           : ₹" + price);
        System.out.println("Total Value     : ₹" + getTotalValue());
        System.out.println("-------------------------------------------");
    }
}

public class InventoryManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = new ArrayList<>();

    public static void addProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        products.add(new Product(id, name, quantity, price));

        System.out.println("Product Added Successfully.");
    }

    public static Product searchProduct(int id) {

        for (Product p : products) {
            if (p.getProductId() == id) {
                return p;
            }
        }

        return null;
    }

    public static void displayProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = searchProduct(id);

        if (p != null) {
            p.displayProduct();
        } else {
            System.out.println("Product Not Found.");
        }
    }

    public static void updateProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Product p = searchProduct(id);

        if (p != null) {

            System.out.print("Enter New Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter New Price: ");
            double price = sc.nextDouble();

            p.updateProduct(name, quantity, price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");
        }
    }

    public static void deleteProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = searchProduct(id);

        if (p != null) {

            products.remove(p);

            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");
        }
    }

    public static void displayAllProducts() {

        if (products.isEmpty()) {

            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\n========== INVENTORY ==========");

        double totalInventoryValue = 0;

        for (Product p : products) {

            p.displayProduct();
            totalInventoryValue += p.getTotalValue();
        }

        System.out.println("Total Inventory Value : ₹" + totalInventoryValue);
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n========== INVENTORY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProduct();
                    break;

                case 3:
                    updateProduct();
                    break;

                case 4:
                    deleteProduct();
                    break;

                case 5:
                    displayAllProducts();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
