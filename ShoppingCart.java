import java.util.ArrayList;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        cart.add(new Product("Keyboard", 1200, 2));
        cart.add(new Product("Mouse", 700, 1));
        cart.add(new Product("Headphones", 2500, 1));

        double total = 0;

        System.out.println("===== SHOPPING CART =====");

        for (Product product : cart) {

            double itemTotal = product.getTotal();

            System.out.printf(
                    "%-15s ₹%.2f x %d = ₹%.2f%n",
                    product.name,
                    product.price,
                    product.quantity,
                    itemTotal
            );

            total += itemTotal;
        }

        double discount = total > 5000 ? total * 0.10 : 0;
        double finalAmount = total - discount;

        System.out.println("-------------------------------");
        System.out.printf("Total    : ₹%.2f%n", total);
        System.out.printf("Discount : ₹%.2f%n", discount);
        System.out.printf("Final    : ₹%.2f%n", finalAmount);
    }
}
