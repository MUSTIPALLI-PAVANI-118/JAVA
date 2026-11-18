// Airport.java
import java.util.ArrayList;
import java.util.List;

public class Airport {
    private final String name;
    private final List<Station> stations = new ArrayList<>();

    public Airport(String name) {
        this.name = name;
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public String getName() {
        return name;
    }

    public List<Station> getStations() {
        return new ArrayList<>(stations);
    }
}
