class Robot {
    private String name;
    private String color;
    private int height;

    private Robot(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.height = builder.height;
    }

    void show() {
        System.out.println(name + " is " + color + " and " + height + "cm tall");
    }

    static class Builder {
        private String name;
        private String color;
        private int height;

        Builder setName(String name) { this.name = name; return this; }
        Builder setColor(String color) { this.color = color; return this; }
        Builder setHeight(int height) { this.height = height; return this; }

        Robot build() {
            return new Robot(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Robot r = new Robot.Builder()
                .setName("Atlas")
                .setColor("Silver")
                .setHeight(180)
                .build();
        r.show();
    }
}
