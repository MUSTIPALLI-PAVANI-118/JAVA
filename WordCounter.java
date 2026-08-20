import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {

        String text =
                "java is simple java is powerful java is popular";

        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> wordCount =
                new HashMap<>();

        for (String word : words) {

            wordCount.put(
                    word,
                    wordCount.getOrDefault(word, 0) + 1
            );
        }

        System.out.println("===== WORD FREQUENCY =====");

        for (Map.Entry<String, Integer> entry
                : wordCount.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> "
                            + entry.getValue()
            );
        }
    }
}
