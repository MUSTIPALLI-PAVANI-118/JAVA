interface Signal {
    void displaySignal();
}

class RedSignal implements Signal {
    public void displaySignal() {
        System.out.println("STOP");
    }
}

class GreenSignal implements Signal {
    public void displaySignal() {
        System.out.println("GO");
    }
}

public class TrafficSignalInterface {
    public static void main(String[] args) {

        Signal s;

        s = new RedSignal();
        s.displaySignal();

        s = new GreenSignal();
        s.displaySignal();
    }
}
