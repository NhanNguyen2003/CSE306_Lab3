package eiu.cit.netprog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class lab3_2b {
     public static void main(String[] args) {
        try {
            URL url = new URL("https://www.tanbinhtech.com:8443/sample10.wav");
            InputStream in = url.openStream();
            FileOutputStream fos = new FileOutputStream(
                    "C:\\Users\\nhanv\\lab-streams\\src\\main\\java\\eiu\\cit\\netprog\\sample10.wav");
            int c;
            byte[] dataBuffer = new byte[8192];

            while ((c = in.read(dataBuffer, 0, 8192)) > 0) {
                fos.write(dataBuffer, 0, c);

            }
            fos.flush();
            fos.close();
            File file = new File("D:\\music\\sample1.wav");
            AudioInputStream ais = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
