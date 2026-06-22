import java.util.*;

public class MedianInStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> upper = new PriorityQueue<>();
        ArrayList<String> medians = new ArrayList<>();

        // Balance two heaps after each inserted value.
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (lower.isEmpty() || value <= lower.peek()) lower.add(value);
            else upper.add(value);

            if (lower.size() > upper.size() + 1) upper.add(lower.poll());
            if (upper.size() > lower.size()) lower.add(upper.poll());

            double median;
            if (lower.size() == upper.size()) median = (lower.peek() + upper.peek()) / 2.0;
            else median = lower.peek();
            medians.add(String.format(Locale.US, "%.1f", median));
        }

        System.out.println(String.join(" ", medians));
    }
}

