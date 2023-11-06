package eiu.cit.netprog;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.SourceDataLine;

import javazoom.jl.player.Player;
public class lab3_3 {
    AudioInputStream audioStream = null;
    SourceDataLine sdl = null;
    public static void main (String[] args) {
        try {
            URL url = new URL("http://ice10.outlaw.fm/KIEV2");
            InputStream is = url.openStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            Player mp3player = new Player(bis);
            mp3player.play();
           



        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
