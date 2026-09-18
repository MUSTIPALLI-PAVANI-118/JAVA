public class Question5 {
    public static void main(String[] args) {
        boolean[] booked = {true, true, false, true, false};

        for (int i = 0; i < booked.length; i++) {
            if (!booked[i]) {
                System.out.println("First Available Seat: " + (i + 1));
                break;
            }
        }
    }
}
