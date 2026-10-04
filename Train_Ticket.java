public class Ticket {
    int ticketNumber;
    Passenger passenger;
    Train train;

    Ticket(int ticketNumber, Passenger passenger, Train train) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.train = train;
    }

    void displayTicket() {
        System.out.println("Ticket Number: " + ticketNumber);
        passenger.displayPassenger();
        train.displayTrain();
    }
}
