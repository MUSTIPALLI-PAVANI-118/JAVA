import java.util.*;

public class CompareVersionNumbers {
    private static String nextPart(String version, int[] index) {
        int start = index[0];
        while (index[0] < version.length() && version.charAt(index[0]) != '.') index[0]++;
        String part = version.substring(start, index[0]);
        if (index[0] < version.length() && version.charAt(index[0]) == '.') index[0]++;
        int nonZero = 0;
        while (nonZero < part.length() - 1 && part.charAt(nonZero) == '0') nonZero++;
        return part.substring(nonZero);
    }

    private static int comparePart(String a, String b) {
        if (a.length() != b.length()) return Integer.compare(a.length(), b.length());
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] i = {0};
        int[] j = {0};

        // Compare each dot-separated numeric part.
        while (i[0] < a.length() || j[0] < b.length()) {
            String partA = i[0] < a.length() ? nextPart(a, i) : "0";
            String partB = j[0] < b.length() ? nextPart(b, j) : "0";
            int cmp = comparePart(partA, partB);
            if (cmp > 0) {
                System.out.println(1);
                return;
            } else if (cmp < 0) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(0);
    }
}

