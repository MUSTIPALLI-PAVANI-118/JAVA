interface Alertable {
    void sendAlert();
}

abstract class Notification implements Alertable {
    String recipient;

    Notification(String recipient) {
        this.recipient = recipient;
    }

    abstract String getMessage();

    @Override
    public void sendAlert() {
        System.out.println("Sending to " + recipient + ": " + getMessage());
    }
}

class EmailNotification extends Notification {
    EmailNotification(String recipient) { super(recipient); }

    @Override
    String getMessage() { return "You have a new email."; }
}

class SMSNotification extends Notification {
    SMSNotification(String recipient) { super(recipient); }

    @Override
    String getMessage() { return "You have a new SMS."; }
}

public class Main {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification("ravi@mail.com");
        Notification n2 = new SMSNotification("9876543210");
        n1.sendAlert();
        n2.sendAlert();
    }
}
