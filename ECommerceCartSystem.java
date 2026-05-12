import java.util.ArrayList;
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ECommerceCartSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Laptop", 55000));
        cart.add(new Product("Mouse", 500));
        cart.add(new Product("Keyboard", 1200));

        double total = 0;

        System.out.println("Products in Cart:");

        for (Product p : cart) {

            System.out.println(p.name + " - Rs." + p.price);
            total += p.price;
        }

        System.out.println("\nTotal Amount: Rs." + total);

        double discount = total * 0.10;

        System.out.println("Discount: Rs." + discount);

        System.out.println("Final Amount: Rs." + (total - discount));

        sc.close();
    }
}
