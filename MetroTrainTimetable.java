public class MetroTrainTimetable {
    public static void main(String[] args) {

        String[] stations = {
            "Central", "Egmore", "Guindy",
            "Airport", "Koyambedu"
        };

        String[] timings = {
            "08:00 AM", "08:10 AM",
            "08:25 AM", "08:40 AM",
            "09:00 AM"
        };

        System.out.println("--- METRO TRAIN TIMETABLE ---");

        for (int i = 0; i < stations.length; i++) {
            System.out.println(
                stations[i] + " - " + timings[i]
            );
        }
    }
}
