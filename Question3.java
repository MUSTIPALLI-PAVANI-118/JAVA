import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        HashMap<Integer, String> trains = new HashMap<>();

        trains.put(12760, "Charminar Express");
        trains.put(12627, "Karnataka Express");

        int trainNumber = 12760;

        if (trains.containsKey(trainNumber)) {
            System.out.println("Train Name: " + trains.get(trainNumber));
        } else {
            System.out.println("Train not found");
        }
    }
}
