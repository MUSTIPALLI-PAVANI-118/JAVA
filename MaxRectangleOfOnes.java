import java.util.*;

public class MaxRectangleOfOnes {
    private static int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int best = 0;
        for (int i = 0; i <= heights.length; i++) {
            int current = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] >= current) {
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                best = Math.max(best, height * (i - left - 1));
            }
            stack.push(i);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[] heights = new int[cols];
        int answer = 0;

        // Treat each row as the base of a histogram.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = sc.nextInt();
                heights[j] = (value == 1) ? heights[j] + 1 : 0;
            }
            answer = Math.max(answer, largestRectangle(heights));
        }

        System.out.println(answer);
    }
}

