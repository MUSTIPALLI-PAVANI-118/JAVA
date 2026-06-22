import java.util.*;

public class NonOverlappingSquareSubmatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) matrix[i][j] = sc.nextInt();
        }

        // Print non-overlapping square blocks by increasing size.
        StringBuilder out = new StringBuilder();
        int limit = Math.min(rows, cols);
        for (int size = 1; size <= limit; size++) {
            for (int r = 0; r + size <= rows; r += size) {
                for (int c = 0; c + size <= cols; c += size) {
                    for (int i = r; i < r + size; i++) {
                        for (int j = c; j < c + size; j++) {
                            if (j > c) out.append(' ');
                            out.append(matrix[i][j]);
                        }
                        out.append('\n');
                    }
                    out.append('\n');
                }
            }
        }

        // Remove the final extra blank line.
        System.out.print(out.toString().trim());
    }
}

