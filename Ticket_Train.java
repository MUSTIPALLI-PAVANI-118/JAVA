// Ticket.java
public class Ticket_Train {
    private final String ticketNumber;
    private final Passenger passenger;
    private final String seatNumber;

    public Ticket(String ticketNumber, Passenger passenger, String seatNumber) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}
