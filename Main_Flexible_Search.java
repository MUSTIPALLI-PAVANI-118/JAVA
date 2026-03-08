import java.util.Scanner;
class SearchUtility {
    int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    int search(int[] arr, int key, int start, int end) {
        if (arr == null || arr.length == 0) return -1;
        if (start < 0) start = 0;
        if (end >= arr.length) end = arr.length - 1;
        if (start > end) return -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
    int search(String[] arr, String key) {
        if (key == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (key.equals(arr[i])) return i;
        }
        return -1;
    }
    int search(String[] arr, String key, int start, int end) {
        if (arr == null || arr.length == 0 || key == null) return -1;
        if (start < 0) start = 0;
        if (end >= arr.length) end = arr.length - 1;
        if (start > end) return -1;
        for (int i = start; i <= end; i++) {
            if (key.equals(arr[i])) return i;
        }
        return -1;
    }
}
public class Main_Flexible_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchUtility su = new SearchUtility();
        System.out.println("FLEXIBLE SEARCH UTILITY");
        System.out.println("1. Search Integer in Integer Array");
        System.out.println("2. Search String in String Array");
        System.out.print("Enter choice (1/2): ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Do you want to search within an index range? (yes/no): ");
        String rangeChoice = sc.nextLine().trim().toLowerCase();
        boolean useRange = rangeChoice.equals("yes");
        if (choice == 1) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.print("Enter integer to search: ");
            int key = sc.nextInt();
            int index;
            if (useRange) {
                System.out.print("Enter start index: ");
                int start = sc.nextInt();
                System.out.print("Enter end index: ");
                int end = sc.nextInt();
                index = su.search(arr, key, start, end);
            } else {
                index = su.search(arr, key);
            }
            if (index != -1) System.out.println("Found at index: " + index);
            else System.out.println("Not found!");
        } else if (choice == 2) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            sc.nextLine(); 
            String[] arr = new String[n];
            System.out.println("Enter " + n + " strings:");
            for (int i = 0; i < n; i++) arr[i] = sc.nextLine();
            System.out.print("Enter string to search (case-sensitive): ");
            String key = sc.nextLine();
            int index;
            if (useRange) {
                System.out.print("Enter start index: ");
                int start = sc.nextInt();
                System.out.print("Enter end index: ");
                int end = sc.nextInt();
                index = su.search(arr, key, start, end);
            } else {
                index = su.search(arr, key);
            }
            if (index != -1) System.out.println("Found at index: " + index);
            else System.out.println("Not found!");
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}