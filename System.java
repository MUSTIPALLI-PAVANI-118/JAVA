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
        System.out.printf("%-5d %-15s %.2f%n", id, name, salary);
    }
}

public class System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", 45000));
        employees.add(new Employee(102, "Priya", 52000));
        employees.add(new Employee(103, "Arun", 48000));

        System.out.printf("%-5s %-15s %s%n", "ID", "Name", "Salary");

        for (Employee employee : employees) {
            employee.display();
        }

        System.out.print("\nEnter employee ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Employee employee : employees) {
            if (employee.id == searchId) {
                System.out.println("Employee Found:");
                employee.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}
