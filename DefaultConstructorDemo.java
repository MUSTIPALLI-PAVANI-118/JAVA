class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructorDemo {

    public static void main(String[] args) {

        Student s1 = new Student();  // constructor automatically called
        s1.display();

    }
}
