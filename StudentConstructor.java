public class StudentConstructor {
    int id;
    String name;

    StudentConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        StudentConstructor s =
            new StudentConstructor(101, "Arun");

        s.display();
    }
}
