// High-level module depends on abstraction, not concrete classes
interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    // Dependency injected via constructor
    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void notifyUser(String message) {
        sender.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService service1 = new NotificationService(new EmailSender());
        NotificationService service2 = new NotificationService(new SMSSender());
        service1.notifyUser("Your order has shipped");
        service2.notifyUser("OTP: 4521");
    }
}
