// Split into smaller interfaces instead of one bulky interface
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() { System.out.println("Human working"); }
    public void eat() { System.out.println("Human eating lunch"); }
}

class RobotWorker implements Workable {
    public void work() { System.out.println("Robot working"); }
    // No eat() forced on it, unlike a single fat interface would require
}

public class Main {
    public static void main(String[] args) {
        HumanWorker h = new HumanWorker();
        RobotWorker r = new RobotWorker();
        h.work();
        h.eat();
        r.work();
    }
}
