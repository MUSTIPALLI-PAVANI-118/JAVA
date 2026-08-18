import java.util.ArrayList;
import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class QuizScoreManager {

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("Rahul", 85));
        players.add(new Player("Priya", 95));
        players.add(new Player("Arun", 72));
        players.add(new Player("Pavan", 91));

        players.sort(
            Comparator.comparingInt(
                (Player p) -> p.score
            ).reversed()
        );

        System.out.println("===== LEADERBOARD =====");

        int rank = 1;

        for (Player player : players) {
            System.out.printf(
                "%d. %-10s %d%n",
                rank++,
                player.name,
                player.score
            );
        }
    }
}
