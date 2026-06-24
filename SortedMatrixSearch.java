import java.util.*;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) matrix[i][j] = sc.nextInt();
        }
        int target = sc.nextInt();

        // Start at top-right and discard one row or column each step.
        int r = 0;
        int c = cols - 1;
        boolean found = false;
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                found = true;
                break;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        System.out.println(found);
    }
}

