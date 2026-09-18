class Passenger {
    String name;
    int age;
    String berth;

    Passenger(String name, int age, String berth) {
        this.name = name;
        this.age = age;
        this.berth = berth;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Berth: " + berth);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Passenger p = new Passenger("Pavani", 20, "Lower");
        p.display();
    }
}
