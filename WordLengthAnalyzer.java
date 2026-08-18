import java.util.Scanner;

public class WordLengthAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        String[] words = sentence.split("\\s+");

        String longest = words[0];
        String shortest = words[0];

        int totalLength = 0;

        for (String word : words) {

            totalLength += word.length();

            if (word.length() > longest.length()) {
                longest = word;
            }

            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        double average =
                (double) totalLength / words.length;

        System.out.println("\n===== ANALYSIS =====");
        System.out.println("Total Words: " + words.length);
        System.out.println("Longest Word: " + longest);
        System.out.println("Shortest Word: " + shortest);
        System.out.printf(
                "Average Word Length: %.2f%n",
                average
        );

        sc.close();
    }
}
