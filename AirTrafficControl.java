// AirTrafficControl.java
import java.util.ArrayList;
import java.util.List;

public class AirTrafficControl {
    private final List<Runway> runways = new ArrayList<>();

    public void addRunway(Runway runway) {
        runways.add(runway);
    }

    public Runway assignAvailableRunway() {
        for (Runway runway : runways) {
            if (runway.isAvailable()) {
                runway.setAvailable(false);
                return runway;
            }
        }
        return null;
    }

    public void releaseRunway(Runway runway) {
        if (runway != null && runways.contains(runway)) {
            runway.setAvailable(true);
        }
    }
}
