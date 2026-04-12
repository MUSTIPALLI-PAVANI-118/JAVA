class SleepThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class ThreadExample4 {
    public static void main(String[] args) {
        SleepThread t1 = new SleepThread();
        t1.start();
    }
}
