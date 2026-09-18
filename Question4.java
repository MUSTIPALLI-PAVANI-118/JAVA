import java.util.LinkedList;
import java.util.Queue;

public class Question4 {
    public static void main(String[] args) {
        Queue<String> waitlist = new LinkedList<>();

        waitlist.offer("Pavani");
        waitlist.offer("Anu");
        waitlist.offer("Ravi");

        String confirmedPassenger = waitlist.poll();

        System.out.println("Confirmed Passenger: " + confirmedPassenger);
        System.out.println("Waitlist: " + waitlist);
    }
}
