public class Train {
    int trainNumber;
    String trainName;
    String source;
    String destination;

    Train(int trainNumber, String trainName, String source, String destination) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
    }

    void displayTrain() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }
}
