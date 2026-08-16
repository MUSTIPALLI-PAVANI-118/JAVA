class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showDetails() {
        System.out.println(name + ": $" + price);
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Product");
        System.out.println("Class name: " + cls.getSimpleName());

        System.out.println("Fields:");
        for (var field : cls.getDeclaredFields()) {
            System.out.println(" - " + field.getName() + " : " + field.getType());
        }

        System.out.println("Methods:");
        for (var method : cls.getDeclaredMethods()) {
            System.out.println(" - " + method.getName());
        }

        Object obj = cls.getDeclaredConstructor(String.class, double.class)
                         .newInstance("Laptop", 999.99);
        cls.getMethod("showDetails").invoke(obj);
    }
}
