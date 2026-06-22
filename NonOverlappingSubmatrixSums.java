import java.util.*;

public class NonOverlappingSubmatrixSums {
    private static long sum(long[][] prefix, int r1, int c1, int r2, int c2) {
        return prefix[r2][c2] - prefix[r1][c2] - prefix[r2][c1] + prefix[r1][c1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        long[][] prefix = new long[rows + 1][cols + 1];

        // Build prefix sums.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                long value = sc.nextLong();
                prefix[i][j] = value + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Print each full non-overlapping X by Y block sum.
        ArrayList<String> sums = new ArrayList<>();
        for (int r = 0; r + x <= rows; r += x) {
            for (int c = 0; c + y <= cols; c += y) {
                sums.add(String.valueOf(sum(prefix, r, c, r + x, c + y)));
            }
        }
        System.out.println(String.join(" ", sums));
    }
}

