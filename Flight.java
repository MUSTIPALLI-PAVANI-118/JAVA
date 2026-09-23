// Flight.java
import java.time.LocalDateTime;

public class Flight {
    private final Airplane airplane;
    private final Station departureStation;
    private final Station arrivalStation;
    private final LocalDateTime departureTime;

    public Flight(Airplane airplane, Station departureStation,
                  Station arrivalStation, LocalDateTime departureTime) {
        this.airplane = airplane;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.departureTime = departureTime;
    }

    public void displayDetails() {
        System.out.println("Flight: " + airplane.getFlightNumber());
        System.out.println("Airplane: " + airplane.getModel());
        System.out.println("From: " + departureStation.getName()
                + " (" + departureStation.getLocation() + ")");
        System.out.println("To: " + arrivalStation.getName()
                + " (" + arrivalStation.getLocation() + ")");
        System.out.println("Departure: " + departureTime);
    }
}
