class TrafficRule {
    void displayRule() {
        System.out.println("Follow Traffic Rules");
    }
}

class HelmetRule extends TrafficRule {
    void helmetFine() {
        System.out.println("Fine for not wearing helmet: Rs. 500");
    }
}

public class TrafficFineInheritance {
    public static void main(String[] args) {

        HelmetRule h = new HelmetRule();

        h.displayRule();
        h.helmetFine();
    }
}
