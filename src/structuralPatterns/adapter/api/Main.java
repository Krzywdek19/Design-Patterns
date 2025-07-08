package structuralPatterns.adapter.api;

public class Main {
    public static void main(String[] args) {
        MediaAdapter mediaAdapter = new MediaAdapter();
        SimpleAudioPlayer simpleAudioPlayer = new SimpleAudioPlayer();

        playMedia(mediaAdapter,"MP4", "lala.mp4");
        playMedia(simpleAudioPlayer,"Mp3", "lala.mp3");
    }

    public static void playMedia(AudioPlayer audioPlayer, String fileType, String fileName){
        audioPlayer.play(fileType,fileName);
    }
}
