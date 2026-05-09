import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== JAVA QUIZ =====");

        System.out.println("\n1. Java is?");
        System.out.println("a) Language");
        System.out.println("b) Animal");
        System.out.println("c) Car");

        String ans1 = sc.nextLine();

        if (ans1.equalsIgnoreCase("a")) {
            score++;
        }

        System.out.println("\n2. Which keyword is used for class?");
        System.out.println("a) define");
        System.out.println("b) class");
        System.out.println("c) function");

        String ans2 = sc.nextLine();

        if (ans2.equalsIgnoreCase("b")) {
            score++;
        }

        System.out.println("\n3. Java is Developed By?");
        System.out.println("a) Microsoft");
        System.out.println("b) Apple");
        System.out.println("c) Sun Microsystems");

        String ans3 = sc.nextLine();

        if (ans3.equalsIgnoreCase("c")) {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }
    }
}
