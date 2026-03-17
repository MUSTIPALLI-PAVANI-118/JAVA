class ShoppingCart {
    private String itemName;
    private int quantity;
    private double pricePerItem;

    // Setter methods
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity");
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            System.out.println("Invalid price");
        }
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Business logic method
    public double calculateTotal() {
        return quantity * pricePerItem;
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setItemName("Laptop");
        cart.setQuantity(2);
        cart.setPricePerItem(45000);

        System.out.println("Item: " + cart.getItemName());
        System.out.println("Quantity: " + cart.getQuantity());
        System.out.println("Price per item: " + cart.getPricePerItem());
        System.out.println("Total Cost: " + cart.calculateTotal());
    }
}
