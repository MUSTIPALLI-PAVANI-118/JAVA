import java.util.ArrayList;
import java.util.Scanner;

class Question {

    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer);
    }
}

class QuizManager {

    private ArrayList<Question> questions = new ArrayList<>();
    private int score = 0;

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {

            System.out.println("\n" + q.getQuestion());
            System.out.print("Your Answer: ");

            String userAnswer = sc.nextLine();

            if (q.checkAnswer(userAnswer)) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        System.out.println("\n===== Quiz Completed =====");
        System.out.println("Final Score: " + score + "/" + questions.size());
    }
}

public class QuizApplication {

    public static void main(String[] args) {

        QuizManager quiz = new QuizManager();

        quiz.addQuestion(
                new Question(
                        "What is the capital of India?",
                        "Delhi"
                )
        );

        quiz.addQuestion(
                new Question(
                        "Which language is used for Android development?",
                        "Java"
                )
        );

        quiz.addQuestion(
                new Question(
                        "What is 15 + 10?",
                        "25"
                )
        );

        quiz.addQuestion(
                new Question(
                        "Which planet is known as the Red Planet?",
                        "Mars"
                )
        );

        quiz.startQuiz();
    }
}
