import java.util.*;

public class GroupAnagrams {
    private static String key(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<String, ArrayList<String>> groups = new LinkedHashMap<>();

        // Group by sorted-character signature.
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            String key = key(word);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(word);
        }

        // Print each anagram group on its own line.
        for (ArrayList<String> group : groups.values()) {
            System.out.println(String.join(" ", group));
        }
    }
}

