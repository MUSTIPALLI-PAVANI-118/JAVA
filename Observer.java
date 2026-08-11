import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String event);
}

class Subscriber implements Observer {
    private String name;
    Subscriber(String name) { this.name = name; }

    @Override
    public void update(String event) {
        System.out.println(name + " received update: " + event);
    }
}

class Channel {
    private List<Observer> subscribers = new ArrayList<>();

    void subscribe(Observer o) {
        subscribers.add(o);
    }

    void notifyAll(String event) {
        for (Observer o : subscribers) {
            o.update(event);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        channel.subscribe(new Subscriber("Alice"));
        channel.subscribe(new Subscriber("Bob"));
        channel.notifyAll("New video uploaded!");
    }
}
