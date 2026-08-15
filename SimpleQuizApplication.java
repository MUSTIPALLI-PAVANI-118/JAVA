import java.util.Scanner;

public class SimpleQuizApplication {

    static String[] questions = {
        "Which language is used for Android development?",
        "Which keyword creates an object in Java?",
        "Which collection stores key-value pairs?"
    };

    static String[][] options = {
        {"1. Java", "2. HTML", "3. SQL", "4. CSS"},
        {"1. class", "2. new", "3. this", "4. static"},
        {"1. ArrayList", "2. HashMap", "3. Stack", "4. Queue"}
    };

    static int[] answers = {1, 2, 2};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + (i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            int answer = sc.nextInt();

            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + questions.length);

        sc.close();
    }
}
