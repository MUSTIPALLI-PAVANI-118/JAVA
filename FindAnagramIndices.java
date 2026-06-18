import java.util.*;

public class FindAnagramIndices {
    private static boolean same(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        int n = text.length();
        int m = pattern.length();
        ArrayList<Integer> answer = new ArrayList<>();
        if (m > n) {
            System.out.println();
            return;
        }

        // Sliding window frequency comparison.
        int[] need = new int[256];
        int[] window = new int[256];
        for (int i = 0; i < m; i++) {
            need[pattern.charAt(i)]++;
            window[text.charAt(i)]++;
        }
        if (same(need, window)) answer.add(0);
        for (int i = m; i < n; i++) {
            window[text.charAt(i)]++;
            window[text.charAt(i - m)]--;
            if (same(need, window)) answer.add(i - m + 1);
        }

        // Print starting indices.
        for (int i = 0; i < answer.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer.get(i));
        }
    }
}

