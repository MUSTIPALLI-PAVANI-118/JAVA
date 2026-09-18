class Ticket {
    double fare;

    Ticket(double fare) {
        this.fare = fare;
    }

    double calculateFare() {
        return fare;
    }
}

class TatkalTicket extends Ticket {
    TatkalTicket(double fare) {
        super(fare);
    }

    @Override
    double calculateFare() {
        return fare + 250;
    }
}

public class Question2 {
    public static void main(String[] args) {
        TatkalTicket ticket = new TatkalTicket(850);
        System.out.println("Tatkal Fare: " + ticket.calculateFare());
    }
}
