class Car {

    String brand;
    int speed;

    // Parameterized Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class ParameterizedConstructorDemo {

    public static void main(String[] args) {

        Car c1 = new Car("BMW", 120);
        Car c2 = new Car("Audi", 150);

        c1.display();
        c2.display();

    }
}
