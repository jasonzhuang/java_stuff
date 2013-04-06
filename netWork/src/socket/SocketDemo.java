package socket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * the Socket class is Java's fundamental class for performing client-side TCP operations.
 * Other client-oriented classes that make TCP network connections such as URL, URLConnection, 
 * Applet, and JEditorPane all ultimately end up invoking the methods of this class.
 * This class itself uses native code to communicate with the local TCP stack of the host operating system.
 *
 */
public class SocketDemo {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("www.google.com", 80);
            System.out.println("the InetAddress is: " + socket.getInetAddress());
            System.out.println("the port is: " + socket.getPort());
            System.out.println("the localAddress is: " + socket.getLocalAddress());
            System.out.println("the local port is: " + socket.getLocalPort());
            //return an output stream for writing bytes to this socket.
            OutputStream buffered = new BufferedOutputStream(socket.getOutputStream());
            Writer out = new OutputStreamWriter(buffered, "UTF-8");
            out.write("GET / HTTP 1.1 \r\n\r\n");
            out.flush();
            out.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //you should always manually close socket 
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
}
