package eiu.cit.netprog;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class lab3_1 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\music\\sample1.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}