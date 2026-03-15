abstract class Vehicle {
    abstract void speed();
}

class Car extends Vehicle {

    void speed() {
        System.out.println("Car Speed = 120 km/h");
    }
}

class Bike extends Vehicle {

    void speed() {
        System.out.println("Bike Speed = 80 km/h");
    }
}

public class VehicleTest {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.speed();
        v2.speed();

    }
}
