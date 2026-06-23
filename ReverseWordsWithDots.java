import java.util.*;

public class ReverseWordsWithDots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Split on one or more dots and ignore empty parts.
        String[] raw = s.split("\\.+");
        ArrayList<String> words = new ArrayList<>();
        for (String word : raw) {
            if (!word.isEmpty()) words.add(word);
        }

        // Print words in reverse order with one dot.
        Collections.reverse(words);
        System.out.println(String.join(".", words));
    }
}

