class Employee {
    int salary = 30000;
}

class Manager extends Employee {
    int bonus = 5000;

    void totalSalary() {
        int total = salary + bonus;
        System.out.println("Total Salary: " + total);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.totalSalary();
    }
}
