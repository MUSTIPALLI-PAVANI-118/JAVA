import java.util.HashMap;
import java.util.Map;

public class WordFrequencyAnalyzer {

    public static void main(String[] args) {

        String sentence = "java is powerful and java is popular";

        String[] words = sentence.toLowerCase().split(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
