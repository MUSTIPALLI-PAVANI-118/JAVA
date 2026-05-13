import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter task: ");
                    String task = sc.nextLine();

                    tasks.add(task);

                    System.out.println("Task Added");
                    break;

                case 2:

                    System.out.println("\nTasks:");

                    for (int i = 0; i < tasks.size(); i++) {

                        System.out.println(
                                (i + 1) + ". " + tasks.get(i));
                    }
                    break;

                case 3:

                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt();

                    tasks.remove(index - 1);

                    System.out.println("Task Removed");
                    break;

                case 4:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
