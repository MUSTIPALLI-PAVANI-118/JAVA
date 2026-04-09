class TicketCounter {
    private int availableSeats;
    TicketCounter(int seats) {
        availableSeats = seats;
    }
    synchronized void bookTicket(String passengerName, int seatsWanted) {
        System.out.println(passengerName + " trying to book " + seatsWanted + " seat(s)");

        if (seatsWanted <= availableSeats) {
            System.out.println("Booking successful for " + passengerName);
            availableSeats -= seatsWanted;
            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + passengerName + " (Not enough seats)");
            System.out.println("Seats left: " + availableSeats);
        }
    }
}
class BookingThread extends Thread {
    TicketCounter counter;
    String passengerName;
    int seatsWanted;
    BookingThread(TicketCounter counter, String passengerName, int seatsWanted) {
        this.counter = counter;
        this.passengerName = passengerName;
        this.seatsWanted = seatsWanted;
    }
    public void run() {
        counter.bookTicket(passengerName, seatsWanted);
    }
}
public class TicketBookingDemo {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter(5); // limited seats
        BookingThread t1 = new BookingThread(counter, "Alice", 2);
        BookingThread t2 = new BookingThread(counter, "Bob", 2);
        BookingThread t3 = new BookingThread(counter, "Charlie", 2);
        t1.start();
        t2.start();
        t3.start();
    }
}