package DesignPattern.Adapter.MediaPlayerExample;

public class AdvancedMediaPlayerAdapter implements MediaPlayer{
    private final AdvancedMediaPlayer amp;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer amp){
        this.amp = amp;
    }

    @Override
    public void play(String filename) {
        amp.playAdvanced(filename);
    }

    @Override
    public void stop() {
        amp.stopAdvanced();
    }
}
