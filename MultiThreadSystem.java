// Compute Task
class ComputeTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Compute: Square of " + i + " = " + (i * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
}

// Log Task
class LogTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Log: Writing log entry " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {}
        }
    }
}

// Display Task
class DisplayTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Display: Showing data " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {}
        }
    }
}

public class MultiThreadSystem {
    public static void main(String[] args) {

        // Create Runnable objects
        Runnable compute = new ComputeTask();
        Runnable log = new LogTask();
        Runnable display = new DisplayTask();

        // Create Threads
        Thread t1 = new Thread(compute);
        Thread t2 = new Thread(log);
        Thread t3 = new Thread(display);

        // Start all threads (concurrent execution)
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {}

        System.out.println("All tasks completed!");
    }
}