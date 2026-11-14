class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public void setDetails(String number, String type) {
        vehicleNumber = number;
        vehicleType = type;
    }

    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        v.setDetails("AP02AB1234", "Car");
        v.display();
    }
}
