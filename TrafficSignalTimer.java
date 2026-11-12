public class TrafficSignalTimer {

    static void showSignal(String color, int seconds) {
        System.out.println(color + " Signal: " + seconds + " seconds");
    }

    public static void main(String[] args) {

        showSignal("Red", 60);
        showSignal("Yellow", 5);
        showSignal("Green", 40);
    }
}
