class SleepThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);
                Thread.sleep(1000); // 1 second delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadExample3 {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        t1.start();
    }
}
