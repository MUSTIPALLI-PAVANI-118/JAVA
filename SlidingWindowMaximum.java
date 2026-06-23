import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        if (k <= 0 || n == 0) return;

        // Deque stores indices in decreasing value order.
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) deque.pollFirst();
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) deque.pollLast();
            deque.addLast(i);
            if (i >= k - 1) answer.add(arr[deque.peekFirst()]);
        }

        // Print all window maximums.
        for (int i = 0; i < answer.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(answer.get(i));
        }
    }
}

