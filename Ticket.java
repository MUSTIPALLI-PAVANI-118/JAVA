enum TicketType {
    GENERAL(100), VIP(500), BACKSTAGE(1000);

    private final int price;
    TicketType(int price) { this.price = price; }
    int getPrice() { return price; }
}

class Ticket {
    private TicketType type;

    Ticket(TicketType type) { this.type = type; }

    void printDetails() {
        System.out.println(type + " ticket costs " + type.getPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(TicketType.VIP);
        Ticket t2 = new Ticket(TicketType.GENERAL);
        t1.printDetails();
        t2.printDetails();
    }
}
