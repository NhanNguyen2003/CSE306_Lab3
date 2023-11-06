package eiu.cit.netprog;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class lab3_2a {
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

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
