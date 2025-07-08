package structuralPatterns.adapter.api;

import structuralPatterns.adapter.lib.Mp4Player;

public class MediaAdapter implements AudioPlayer {
    private final Mp4Player mp4Player = new Mp4Player();

    public void play(String fileType, String fileName){
        if(fileType.equalsIgnoreCase("mp4")){
            mp4Player.playMp4(fileName);
        }else {
            System.out.println("Unsupported format");
        }
    }
}
