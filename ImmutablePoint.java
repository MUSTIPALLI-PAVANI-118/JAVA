final class ImmutablePoint {
    private final int x;
    private final int y;

    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() { return x; }
    int getY() { return y; }

    // Returns a new object instead of modifying existing state
    ImmutablePoint translate(int dx, int dy) {
        return new ImmutablePoint(this.x + dx, this.y + dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        ImmutablePoint p1 = new ImmutablePoint(2, 3);
        ImmutablePoint p2 = p1.translate(5, 5);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }
}
