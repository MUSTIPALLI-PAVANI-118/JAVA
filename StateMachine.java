interface TrafficState {
    void next(TrafficLight light);
    String getColor();
}

class RedState implements TrafficState {
    public void next(TrafficLight light) { light.setState(new GreenState()); }
    public String getColor() { return "RED"; }
}

class GreenState implements TrafficState {
    public void next(TrafficLight light) { light.setState(new YellowState()); }
    public String getColor() { return "GREEN"; }
}

class YellowState implements TrafficState {
    public void next(TrafficLight light) { light.setState(new RedState()); }
    public String getColor() { return "YELLOW"; }
}

class TrafficLight {
    private TrafficState state = new RedState();

    void setState(TrafficState state) {
        this.state = state;
    }

    void change() {
        System.out.println("Current: " + state.getColor());
        state.next(this);
    }
}

public class StateMachine {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 4; i++) {
            light.change();
        }
    }
}
