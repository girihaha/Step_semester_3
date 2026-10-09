package oop.class_problems;

interface MediaPlayer {
    void play(String filename);
}

class AudioPlayer implements MediaPlayer {
    public void play(String filename) {
        System.out.println("Playing audio file: " + filename);
    }
}

class VideoPlayer implements MediaPlayer {
    public void play(String filename) {
        System.out.println("Playing video stream: " + filename);
    }
}

public class MediaPlayback {
    public static void main(String[] args) {
        MediaPlayer p1 = new AudioPlayer();
        MediaPlayer p2 = new VideoPlayer();
        p1.play("song.mp3");
        p2.play("lecture.mp4");
    }
}
