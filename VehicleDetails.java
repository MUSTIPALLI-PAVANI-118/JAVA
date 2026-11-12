class Vehicle {
    String name;
    String number;

    void display() {
        System.out.println("Vehicle: " + name);
        System.out.println("Number: " + number);
    }
}

public class VehicleDetails {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        v1.name = "Car";
        v1.number = "AP21AB1234";

        v1.display();
    }
}
