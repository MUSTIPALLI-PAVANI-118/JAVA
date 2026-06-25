import java.util.*;

public class SplitArrayIntoFibonacciSequence {
    private static boolean search(String s, int index, ArrayList<Integer> sequence) {
        if (index == s.length()) return sequence.size() >= 3;

        // Try every valid next number.
        long number = 0;
        for (int i = index; i < s.length(); i++) {
            if (i > index && s.charAt(index) == '0') break;
            number = number * 10 + (s.charAt(i) - '0');
            if (number > Integer.MAX_VALUE) break;

            int size = sequence.size();
            if (size >= 2) {
                long expected = (long) sequence.get(size - 1) + sequence.get(size - 2);
                if (number < expected) continue;
                if (number > expected) break;
            }

            sequence.add((int) number);
            if (search(s, i + 1, sequence)) return true;
            sequence.remove(sequence.size() - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Backtrack until a Fibonacci-like split is found.
        boolean possible = search(s, 0, new ArrayList<>());
        System.out.println(possible ? "YES" : "NO");
    }
}

