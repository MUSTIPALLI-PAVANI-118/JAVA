import java.util.ArrayList;

public class TrafficFineList {
    public static void main(String[] args) {

        ArrayList<String> violations = new ArrayList<>();

        violations.add("No Helmet");
        violations.add("Over Speeding");
        violations.add("Signal Jumping");
        violations.add("No Seat Belt");

        System.out.println("Traffic Violations:");

        for (String v : violations) {
            System.out.println(v);
        }
    }
}
