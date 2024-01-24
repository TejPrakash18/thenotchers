package DesignPattern.Adapter.MediaPlayerExample;

public class Client {
    public static void main(String[] args) {

        AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
        MediaPlayer mediaPlayer = new AdvancedMediaPlayerAdapter(advancedMediaPlayer);

        mediaPlayer.play("song.mp3");
        mediaPlayer.stop();

//        AdvancedMediaPlayer amp =  new AdvancedMediaPlayer();
//        MediaPlayer mp = new AdvancedMediaPlayerAdapter(amp);

//        mp.play("song.mp3");
//        mp.stop();

    }
}
