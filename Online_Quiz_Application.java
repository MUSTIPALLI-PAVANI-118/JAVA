import java.util.Scanner;

class Question {

    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int answer;

    public Question(String question, String option1, String option2,
                    String option3, String option4, int answer) {

        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public void displayQuestion() {

        System.out.println("\n" + question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
    }
}

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Question[] quiz = {

            new Question(
                    "1. Which language is platform independent?",
                    "Java", "C", "Python", "C++", 1),

            new Question(
                    "2. Which keyword is used to inherit a class?",
                    "implements", "extends", "super", "this", 2),

            new Question(
                    "3. Which package contains Scanner class?",
                    "java.io", "java.lang", "java.util", "java.net", 3),

            new Question(
                    "4. Which loop executes at least once?",
                    "for", "while", "do-while", "foreach", 3),

            new Question(
                    "5. Which keyword creates an object?",
                    "class", "new", "void", "static", 2)
        };

        int score = 0;

        System.out.println("=================================");
        System.out.println("      ONLINE QUIZ APPLICATION");
        System.out.println("=================================");

        for (int i = 0; i < quiz.length; i++) {

            quiz[i].displayQuestion();

            System.out.print("Enter Your Answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == quiz[i].answer) {

                System.out.println("Correct Answer!");
                score++;

            } else {

                System.out.println("Wrong Answer!");
                System.out.println("Correct Option: " + quiz[i].answer);
            }
        }

        System.out.println("\n=================================");
        System.out.println("          QUIZ RESULT");
        System.out.println("=================================");

        System.out.println("Total Questions : " + quiz.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (quiz.length - score));

        double percentage = (score * 100.0) / quiz.length;

        System.out.printf("Percentage      : %.2f%%\n", percentage);

        if (percentage >= 80) {

            System.out.println("Grade : A");
            System.out.println("Excellent Performance!");

        } else if (percentage >= 60) {

            System.out.println("Grade : B");
            System.out.println("Very Good!");

        } else if (percentage >= 40) {

            System.out.println("Grade : C");
            System.out.println("Pass");

        } else {

            System.out.println("Grade : F");
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}
