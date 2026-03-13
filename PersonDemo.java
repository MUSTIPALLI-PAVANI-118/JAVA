class Person {
    void greet() {
        System.out.println("Hello");
    }
}

class Student extends Person {
    void greet() {
        System.out.println("Hello, I am a student");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.greet();
    }
}
