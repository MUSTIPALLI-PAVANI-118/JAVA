public class ICRTCTrain {
    public static void main(String[] args) {

        Train train = new Train(
            12627,
            "Karnataka Express",
            "Bangalore",
            "New Delhi"
        );

        Passenger passenger = new Passenger("Rahul", 20);

        Ticket ticket = Booking.bookTicket(passenger, train);

        System.out.println("===== ICRTC TRAIN TICKET =====");
        ticket.displayTicket();
    }
}
