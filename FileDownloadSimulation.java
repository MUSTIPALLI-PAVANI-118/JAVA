class Download {
    int progress = 0; // shared variable
}
class Downloader extends Thread {
    Download d;
    Downloader(Download d) {
        this.d = d;
    }
    public void run() {
        for (int i = 0; i <= 100; i++) {
            d.progress = i;
            try {
                Thread.sleep(100); // simulate download time
            } catch (InterruptedException e) {}
        }
    }
}
class ProgressDisplay extends Thread {
    Download d;
    ProgressDisplay(Download d) {
        this.d = d;
    }
    public void run() {
        while (true) {
            System.out.println("Download Progress: " + d.progress + "%");
            if (d.progress >= 100) {
                break;
            }
            try {
                Thread.sleep(200); // display delay
            } catch (InterruptedException e) {}
        }
    }
}

public class FileDownloadSimulation {
    public static void main(String[] args) {
        Download d = new Download();
        Downloader t1 = new Downloader(d);
        ProgressDisplay t2 = new ProgressDisplay(d);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
        System.out.println("Download Completed!");
    }
}