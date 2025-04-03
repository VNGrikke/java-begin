package b04;

public class adapterMedia implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public adapterMedia() {
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("Vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("Mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
