class Person {
    String name = "Ravi";
    int age = 20;
}

class Student extends Person {
    int marks = 85;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
