class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle flies very high");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
    }
}
