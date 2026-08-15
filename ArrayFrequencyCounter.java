import java.util.HashMap;
import java.util.Map;

public class ArrayFrequencyCounter {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 2, 5, 4, 2, 7, 5, 4};

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        System.out.println("Element Frequency:");

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
