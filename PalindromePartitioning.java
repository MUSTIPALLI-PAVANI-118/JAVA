import java.util.*;

public class PalindromePartitioning {
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    private static void backtrack(String s, int index, ArrayList<String> path, ArrayList<ArrayList<String>> result) {
        if (index == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int end = index; end < s.length(); end++) {
            if (isPalindrome(s, index, end)) {
                path.add(s.substring(index, end + 1));
                backtrack(s, end + 1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Generate all palindrome partitions.
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);

        // Print one partition per line.
        for (ArrayList<String> partition : result) {
            System.out.println(String.join(" ", partition));
        }
    }
}

