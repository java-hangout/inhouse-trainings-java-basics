package com.jh.igniteprogram.java.advance.day01;

// Target interface
interface MediaPlayer {
    String play(String mediaType);
}

// Adaptee class
class MediaAdapter implements MediaPlayer {
    private OldMediaPlayer oldMediaPlayer;

    public MediaAdapter(OldMediaPlayer oldMediaPlayer) {
        this.oldMediaPlayer = oldMediaPlayer;
    }

    @Override
    public String play(String mediaType) {
        return oldMediaPlayer.playOldMedia(mediaType);
    }
}

// Old system interface
class OldMediaPlayer {
    public String playOldMedia(String mediaType) {
        return "Playing old media type: " + mediaType;
    }
}

public class DesignPattern02 {

    // Method to demonstrate the Adapter pattern
    public static String run(String mediaType) {
        OldMediaPlayer oldMediaPlayer = new OldMediaPlayer();
        MediaPlayer mediaAdapter = new MediaAdapter(oldMediaPlayer);
        return mediaAdapter.play(mediaType);
    }
}
