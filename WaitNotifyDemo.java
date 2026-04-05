import java.util.Scanner;

class Message {
    private String msg;
    private boolean ready = false;

    public synchronized void write(String message) {
        while (ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        msg = message;
        ready = true;
        System.out.println("Produced message: " + msg);
        notify();
    }

    public synchronized void read() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Consumed message: " + msg);
        ready = false;
        notify();
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String inputMessage = sc.nextLine();

        Message message = new Message();

        Thread consumer = new Thread(() -> {
            message.read();
        });

        Thread producer = new Thread(() -> {
            message.write(inputMessage);
        });

        consumer.start();
        producer.start();

        sc.close();
    }
}