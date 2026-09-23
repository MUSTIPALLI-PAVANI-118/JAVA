public class Airplane {
    private final String flightNumber;
    private final String model;
    private final int capacity;

    public Airplane(String flightNumber, String model, int capacity) {
        this.flightNumber = flightNumber;
        this.model = model;
        this.capacity = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
