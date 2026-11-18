// Runway.java
public class Runway {
    private final String runwayNumber;
    private boolean available = true;

    public Runway(String runwayNumber) {
        this.runwayNumber = runwayNumber;
    }

    public String getRunwayNumber() {
        return runwayNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
