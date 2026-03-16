abstract class Appliance {

    abstract void turnOn();
}

class Fan extends Appliance {

    void turnOn() {
        System.out.println("Fan is rotating");
    }
}

class WashingMachine extends Appliance {

    void turnOn() {
        System.out.println("Washing machine started washing");
    }
}

public class ApplianceDemo {

    public static void main(String[] args) {

        Appliance a1 = new Fan();
        Appliance a2 = new WashingMachine();

        a1.turnOn();
        a2.turnOn();
    }
}
