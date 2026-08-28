public class F1Car {
    String driver;
    String team;
    int speed;

    void displayCar() {
        System.out.println("===== F1 CAR =====");
        System.out.println("Driver : " + driver);
        System.out.println("Team   : " + team);
        System.out.println("Speed  : " + speed + " km/h");
    }

    public static void main(String[] args) {
        F1Car car = new F1Car();

        car.driver = "Max Verstappen";
        car.team = "Red Bull Racing";
        car.speed = 340;

        car.displayCar();
    }
}
