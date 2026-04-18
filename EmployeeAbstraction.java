abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void display();
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void display() {
        System.out.println("Manager Name: " + name);
    }
}

public class EmployeeAbstraction {
    public static void main(String[] args) {
        Employee e = new Manager("John");
        e.display();
    }
}
