import java.util.*;

public class SubmatrixSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        long[][] prefix = new long[rows + 1][cols + 1];

        // Build 2D prefix sum while reading the matrix.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                long value = sc.nextLong();
                prefix[i][j] = value + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }

        // Read 1-based query corners.
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (x1 > x2) { int temp = x1; x1 = x2; x2 = temp; }
        if (y1 > y2) { int temp = y1; y1 = y2; y2 = temp; }

        // Answer the query in O(1).
        long sum = prefix[x2][y2] - prefix[x1 - 1][y2] - prefix[x2][y1 - 1] + prefix[x1 - 1][y1 - 1];
        System.out.println(sum);
    }
}

