import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ToDoListApp {
    static Map<Integer, String> tasks = new LinkedHashMap<>();
    static int nextId = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = sc.nextLine();
                    tasks.put(nextId++, task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (Map.Entry<Integer, String> entry : tasks.entrySet()) {
                            System.out.println(entry.getKey() + ". " + entry.getValue());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task ID to remove: ");
                    int id = sc.nextInt();
                    if (tasks.remove(id) != null) {
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Task ID not found.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
