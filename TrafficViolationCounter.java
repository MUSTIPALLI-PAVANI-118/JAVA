class Violation {
    int count;

    Violation(int c) {
        count = c;
    }

    void display() {
        System.out.println("Total Traffic Violations: " + count);
    }
}

public class TrafficViolationCounter {
    public static void main(String[] args) {

        Violation v = new Violation(25);

        v.display();
    }
}
