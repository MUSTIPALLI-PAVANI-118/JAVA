// T must be a Number or subclass (bounded type parameter)
class NumericBox<T extends Number> {
    private T value;

    NumericBox(T value) {
        this.value = value;
    }

    double doubleValue() {
        return value.doubleValue();
    }

    boolean isGreaterThan(NumericBox<T> other) {
        return this.doubleValue() > other.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        NumericBox<Integer> box1 = new NumericBox<>(10);
        NumericBox<Integer> box2 = new NumericBox<>(20);
        System.out.println(box1.isGreaterThan(box2));

        NumericBox<Double> box3 = new NumericBox<>(15.5);
        System.out.println(box3.doubleValue());
    }
}
