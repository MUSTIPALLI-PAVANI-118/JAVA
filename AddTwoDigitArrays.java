import java.util.*;

public class AddTwoDigitArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        // Add from the last digit to the first.
        LinkedList<Integer> result = new LinkedList<>();
        int i = n - 1;
        int j = m - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a[i--];
            if (j >= 0) sum += b[j--];
            result.addFirst(sum % 10);
            carry = sum / 10;
        }
        while (result.size() > 1 && result.peekFirst() == 0) result.removeFirst();

        // Print sum as digits.
        int index = 0;
        for (int digit : result) {
            if (index++ > 0) System.out.print(" ");
            System.out.print(digit);
        }
    }
}

