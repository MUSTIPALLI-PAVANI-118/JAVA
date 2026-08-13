// Open for extension (new discount types), closed for modification
interface Discountable {
    double applyDiscount(double price);
}

class NoDiscount implements Discountable {
    public double applyDiscount(double price) { return price; }
}

class SeasonalDiscount implements Discountable {
    public double applyDiscount(double price) { return price * 0.9; }
}

class ClearanceDiscount implements Discountable {
    public double applyDiscount(double price) { return price * 0.5; }
}

class PriceCalculator {
    double getFinalPrice(double price, Discountable discount) {
        return discount.applyDiscount(price);
    }
}

public class Main {
    public static void main(String[] args) {
        PriceCalculator calc = new PriceCalculator();
        System.out.println(calc.getFinalPrice(1000, new SeasonalDiscount()));
        System.out.println(calc.getFinalPrice(1000, new ClearanceDiscount()));
    }
}
