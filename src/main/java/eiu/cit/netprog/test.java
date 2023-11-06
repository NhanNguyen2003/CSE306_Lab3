package eiu.cit.netprog;

import java.io.IOException;
import java.net.*;

public class test {
    public static void main(String[] args) {
        try {
            String host = args.length > 0 ? args[0] : "localhost";
            for (int i = 1; i < 1024; i++) {
                Socket s = new Socket(host, i);
                System.out.println("There is a server on port " + i + "of" + host);
                s.close();
            }
        } catch (UnknownHostException e) {
            // TODO: handle exception
            System.err.println(e);
        } catch (IOException e) {

        }

    }
}
