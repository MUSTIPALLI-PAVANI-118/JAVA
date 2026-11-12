public class VehicleSpeedRecords {
    public static void main(String[] args) {

        int[] speeds = {40, 60, 75, 50, 90};

        System.out.println("Vehicle Speed Records:");

        for (int i = 0; i < speeds.length; i++) {
            System.out.println("Vehicle " + (i + 1) +
                               ": " + speeds[i] + " km/h");
        }
    }
}
