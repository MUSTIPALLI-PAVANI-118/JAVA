class Vehicle {
    void showType() {
        System.out.println("General Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void showType() {
        System.out.println("Four Wheeler");
    }
}

class Bike extends Vehicle {
    @Override
    void showType() {
        System.out.println("Two Wheeler");
    }
}

public class VehiclePolymorphism {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.showType();

        v = new Bike();
        v.showType();
    }
}
