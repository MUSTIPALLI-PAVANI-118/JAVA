// AirplaneStationApp.java
import java.time.LocalDateTime;

public class AirplaneStationApp {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AI-204", "Boeing 737", 180);
        Station departure = new Station("City Airport", "Mumbai");
        Station arrival = new Station("Central Airport", "Delhi");

        Flight flight = new Flight(
                airplane,
                departure,
                arrival,
                LocalDateTime.of(2026, 10, 5, 9, 30)
        );

        flight.displayDetails();
    }
}
