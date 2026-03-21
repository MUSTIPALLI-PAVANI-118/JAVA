import java.util.Scanner;
interface MediaPlayer {
    void play();
}
class AudioPlayer implements MediaPlayer {
    String audioName;
    void getAudio(String audioName) {
        this.audioName = audioName;
    }
    public void play() {
        System.out.println("Playing Audio: " + audioName);
    }
}
class VideoPlayer implements MediaPlayer {
    String videoName;
    void getVideo(String videoName) {
        this.videoName = videoName;
    }
    public void play() {
        System.out.println("Playing Video: " + videoName);
    }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Media Type:");
        System.out.println("1. Audio");
        System.out.println("2. Video");
        int choice = sc.nextInt();
        sc.nextLine(); 
        MediaPlayer mp; 
        if (choice == 1) {
            System.out.print("Enter Audio Name: ");
            String audio = sc.nextLine();
            AudioPlayer ap = new AudioPlayer();
            ap.getAudio(audio);
            mp = ap; 
        } else {
            System.out.print("Enter Video Name: ");
            String video = sc.nextLine();
            VideoPlayer vp = new VideoPlayer();
            vp.getVideo(video);
            mp = vp; 
        }
        mp.play();
        sc.close();
    }
}