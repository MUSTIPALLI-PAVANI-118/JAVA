interface Playable {
    void play();
    default void pause() {
        System.out.println("Playback paused");
    }
}

interface Recordable {
    void record();
    default void stopRecording() {
        System.out.println("Recording stopped");
    }
}

class MediaDevice implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Playing media...");
    }

    @Override
    public void record() {
        System.out.println("Recording media...");
    }
}

public class Main {
    public static void main(String[] args) {
        MediaDevice device = new MediaDevice();
        device.play();
        device.pause();
        device.record();
        device.stopRecording();
    }
}
