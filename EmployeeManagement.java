import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------");
    }
}

public class EmployeeManagement {

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addEmployee() {

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, salary));

        System.out.println("Employee Added Successfully!");
    }

    static void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
