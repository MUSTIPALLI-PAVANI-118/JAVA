class SleepThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Sleeping Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        t1.start();
    }
}
