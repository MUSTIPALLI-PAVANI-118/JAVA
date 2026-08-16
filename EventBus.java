interface Command {
    void execute();
}

class LightOnCommand implements Command {
    public void execute() {
        System.out.println("Light turned ON");
    }
}

class LightOffCommand implements Command {
    public void execute() {
        System.out.println("Light turned OFF");
    }
}

class RemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}

public class EventBus {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand());
        remote.pressButton();

        remote.setCommand(new LightOffCommand());
        remote.pressButton();
    }
}
