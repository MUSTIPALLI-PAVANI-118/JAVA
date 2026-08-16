import java.util.ArrayList;
import java.util.List;

interface StockObserver {
    void update(String stock, double price);
}

class Investor implements StockObserver {
    private String name;
    Investor(String name) { this.name = name; }

    @Override
    public void update(String stock, double price) {
        System.out.println(name + " notified: " + stock + " is now $" + price);
    }
}

class StockMarket {
    private List<StockObserver> observers = new ArrayList<>();

    void subscribe(StockObserver o) {
        observers.add(o);
    }

    void unsubscribe(StockObserver o) {
        observers.remove(o);
    }

    void priceChanged(String stock, double price) {
        for (StockObserver o : observers) {
            o.update(stock, price);
        }
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Investor a = new Investor("Alice");
        Investor b = new Investor("Bob");

        market.subscribe(a);
        market.subscribe(b);
        market.priceChanged("AAPL", 190.50);

        market.unsubscribe(b);
        market.priceChanged("AAPL", 195.00);
    }
}
