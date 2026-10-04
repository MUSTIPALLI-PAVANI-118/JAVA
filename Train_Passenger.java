public class Passenger {
    String name;
    int age;

    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPassenger() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Age: " + age);
    }
}
