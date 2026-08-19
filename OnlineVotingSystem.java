import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineVotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> votes = new HashMap<>();

        votes.put("Candidate A", 0);
        votes.put("Candidate B", 0);
        votes.put("Candidate C", 0);

        System.out.println("===== ONLINE VOTING SYSTEM =====");

        System.out.println("1. Candidate A");
        System.out.println("2. Candidate B");
        System.out.println("3. Candidate C");

        System.out.print("Enter your vote: ");
        int choice = sc.nextInt();

        String candidate;

        switch (choice) {
            case 1:
                candidate = "Candidate A";
                break;

            case 2:
                candidate = "Candidate B";
                break;

            case 3:
                candidate = "Candidate C";
                break;

            default:
                System.out.println("Invalid vote.");
                sc.close();
                return;
        }

        votes.put(
                candidate,
                votes.get(candidate) + 1
        );

        System.out.println("Vote recorded successfully!");

        System.out.println("\n===== VOTE RESULTS =====");

        for (Map.Entry<String, Integer> entry
                : votes.entrySet()) {

            System.out.printf(
                    "%-15s : %d votes%n",
                    entry.getKey(),
                    entry.getValue()
            );
        }

        sc.close();
    }
}
