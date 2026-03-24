package device;

import control.Controllable;
import monitor.Monitorable;

public class SmartDevice implements Controllable, Monitorable {

    private String name;
    private boolean status;

    public void setName(String name) {
        this.name = name;
    }

    public void turnOn() {
        status = true;
        System.out.println(name + " is ON");
    }

    public void turnOff() {
        status = false;
        System.out.println(name + " is OFF");
    }

    public void showStatus() {
        System.out.println(name + " Status: " + (status ? "ON" : "OFF"));
    }
}
