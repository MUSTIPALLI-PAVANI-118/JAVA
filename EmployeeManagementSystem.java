import java.util.ArrayList;

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

        System.out.println(
                id + " - " + name + " - Rs." + salary);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Pavani", 50000));
        employees.add(new Employee(102, "Rahul", 45000));

        System.out.println("Employee Details:\n");

        for (Employee e : employees) {

            e.display();
        }
    }
}
