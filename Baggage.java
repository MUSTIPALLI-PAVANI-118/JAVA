// Baggage.java
public class Baggage {
    private final String baggageTag;
    private final double weightKg;

    public Baggage(String baggageTag, double weightKg) {
        if (weightKg <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        this.baggageTag = baggageTag;
        this.weightKg = weightKg;
    }

    public String getBaggageTag() {
        return baggageTag;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
