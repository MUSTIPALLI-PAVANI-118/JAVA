import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("----------------------");
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Marks : " + marks);
    }
}

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.println("\nEnter Student ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Student Marks:");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);
        students.add(s);

        System.out.println("Student Added Successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (Student s : students) {
            s.display();
        }
    }

    public static void searchStudent() {
        System.out.println("\nEnter Student ID to Search:");
        int id = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void deleteStudent() {
        System.out.println("\nEnter Student ID to Delete:");
        int id = sc.nextInt();

        boolean removed = false;

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found.");
        }
    }

    public static void menu() {
        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.println("Enter Your Choice:");
    }

    public static void main(String[] args) {

        while (true) {
            menu();

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
