import java.util.Scanner;

public class OnlineQuizSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which keyword is used to create an object in Java?",
                "2. Which method is the entry point of a Java program?",
                "3. Which package contains the Scanner class?",
                "4. Which loop executes at least once?",
                "5. Which keyword is used for inheritance?",
                "6. Which collection allows duplicate elements?",
                "7. Which operator compares two values?",
                "8. Which keyword is used to stop a loop?",
                "9. Which exception occurs when dividing by zero?",
                "10. Java is a ______ language."
        };

        String[][] options = {
                {"A. class", "B. new", "C. this", "D. static"},
                {"A. start()", "B. run()", "C. main()", "D. execute()"},
                {"A. java.io", "B. java.lang", "C. java.util", "D. java.net"},
                {"A. for", "B. while", "C. do-while", "D. foreach"},
                {"A. implements", "B. extends", "C. import", "D. package"},
                {"A. Set", "B. Map", "C. ArrayList", "D. TreeSet"},
                {"A. =", "B. ==", "C. !=", "D. >"},
                {"A. continue", "B. break", "C. return", "D. exit"},
                {"A. IOException", "B. ArithmeticException", "C. NullPointerException", "D. SQLException"},
                {"A. Compiled", "B. Interpreted", "C. Platform Independent", "D. Machine Language"}
        };

        char[] answers = {
                'B', 'C', 'C', 'C', 'B',
                'C', 'B', 'B', 'B', 'C'
        };

        int score = 0;
        char choice;

        System.out.println("=========================================");
        System.out.println("        JAVA ONLINE QUIZ SYSTEM");
        System.out.println("=========================================");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("\nWelcome " + name + "!");
        System.out.println("Each Question Carries 10 Marks.");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter Your Answer (A/B/C/D): ");
            choice = Character.toUpperCase(sc.next().charAt(0));

            if (choice == answers[i]) {
                System.out.println("Correct Answer!");
                score += 10;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer: " + answers[i]);
            }
        }

        System.out.println("\n=========================================");
        System.out.println("              QUIZ RESULT");
        System.out.println("=========================================");
        System.out.println("Candidate Name : " + name);
        System.out.println("Total Questions: " + questions.length);
        System.out.println("Correct Marks  : " + score);
        System.out.println("Percentage     : " + score + "%");

        if (score >= 90) {
            System.out.println("Grade          : A+");
            System.out.println("Performance    : Excellent");
        } else if (score >= 80) {
            System.out.println("Grade          : A");
            System.out.println("Performance    : Very Good");
        } else if (score >= 70) {
            System.out.println("Grade          : B");
            System.out.println("Performance    : Good");
        } else if (score >= 60) {
            System.out.println("Grade          : C");
            System.out.println("Performance    : Average");
        } else if (score >= 40) {
            System.out.println("Grade          : D");
            System.out.println("Performance    : Pass");
        } else {
            System.out.println("Grade          : F");
            System.out.println("Performance    : Fail");
        }

        System.out.println("-----------------------------------------");

        System.out.print("Do You Want to Retry the Quiz? (Y/N): ");
        char retry = Character.toUpperCase(sc.next().charAt(0));

        if (retry == 'Y') {
            System.out.println("Restart the program to take the quiz again.");
        } else {
            System.out.println("Thank You for Participating!");
        }

        sc.close();
    }
}
