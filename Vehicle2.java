class Vehicle2 {
    String brand;

    Vehicle2(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car2 extends Vehicle2 {
    int doors;

    Car2(String brand, int doors) {
        super(brand); // calls parent constructor
        this.doors = doors;
        System.out.println("Car constructor called");
    }

    @Override
    void display() {
        super.display(); // calls parent method
        System.out.println("Doors: " + doors);
    }
}

public class Main {
    public static void main(String[] args) {
        Car2 c = new Car2("Honda", 4);
        c.display();
    }
}
