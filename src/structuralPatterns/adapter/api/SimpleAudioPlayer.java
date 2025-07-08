package structuralPatterns.adapter.api;

public class SimpleAudioPlayer implements AudioPlayer {
    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        }else {
            System.out.println("Unsupported format");
        }
    }
}
