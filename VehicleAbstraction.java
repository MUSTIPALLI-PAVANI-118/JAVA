abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class VehicleAbstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuel();
    }
}
