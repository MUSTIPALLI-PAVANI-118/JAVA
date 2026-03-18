import java.util.Scanner;

interface MediaPlayer {
    void play();
}

class AudioPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing audio...");
    }
}

class VideoPlayer implements MediaPlayer {
    public void play() {
        System.out.println("Playing video...");
    }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Media Type:");
        System.out.println("1. Audio");
        System.out.println("2. Video");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        MediaPlayer player; 

        switch (choice) {
            case 1:
                player = new AudioPlayer();
                break;
            case 2:
                player = new VideoPlayer();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }
        player.play();
        sc.close();
    }
}