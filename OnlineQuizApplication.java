import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String questions[] = {
                "What is JVM?",
                "Which keyword is used for inheritance?"
        };

        String answers[] = {
                "Java Virtual Machine",
                "extends"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.println("Final Score: " + score);

        sc.close();
    }
}
