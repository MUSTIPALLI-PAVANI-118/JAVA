import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        // Sort by start and merge overlapping ranges.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> merged = new ArrayList<>();
        for (int[] current : intervals) {
            if (merged.isEmpty() || current[0] > merged.get(merged.size() - 1)[1]) {
                merged.add(new int[] { current[0], current[1] });
            } else {
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], current[1]);
            }
        }

        // Print one merged interval per line.
        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}

