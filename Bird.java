// Subclasses must be substitutable for their base class without breaking behavior
abstract class Bird {
    abstract void eat();
}

// Only birds that can actually fly implement this
interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    void eat() { System.out.println("Sparrow eating"); }
    public void fly() { System.out.println("Sparrow flying"); }
}

class Penguin extends Bird {
    void eat() { System.out.println("Penguin eating"); }
    // No fly() method - avoids violating LSP, unlike forcing
    // Penguin to implement Flyable and throw an exception
}

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        Bird b2 = new Penguin();
        b1.eat();
        b2.eat();

        if (b1 instanceof Flyable) {
            ((Flyable) b1).fly();
        }
    }
}
