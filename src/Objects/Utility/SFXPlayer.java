package Objects.Utility;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;
import java.net.URL;

public class SFXPlayer {
    private Clip clip;
    private boolean looping;

    public SFXPlayer(String sound, boolean looping) {
        try {
            this.looping = looping;
            URL soundUrl = this.getClass().getResource(sound);
            AudioInputStream temp = AudioSystem.getAudioInputStream(soundUrl);
            clip = AudioSystem.getClip();
            clip.open(temp);
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void setVolume(float gain) {
        ((FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN)).setValue(gain);
    }

    public void play() {
        if(looping) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } else {
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void stop() {
        clip.stop();
    }

    public Clip getClip() {
        return clip;
    }
}
