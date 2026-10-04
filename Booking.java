public class Booking {
    static int ticketCounter = 1000;

    static Ticket bookTicket(Passenger passenger, Train train) {
        ticketCounter++;
        return new Ticket(ticketCounter, passenger, train);
    }
}
