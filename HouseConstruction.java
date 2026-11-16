
public class HouseConstruction {
    public static void main(String[] args) {

        String[] stages = {
            "Foundation Work",
            "Pillar Construction",
            "Wall Construction",
            "Roof Construction",
            "Painting",
            "Final Finishing"
        };

        System.out.println("HOUSE CONSTRUCTION STAGES");

        for (int i = 0; i < stages.length; i++) {
            System.out.println((i + 1) + ". " + stages[i]);
        }

        System.out.println("House Construction Completed!");
    }
}
