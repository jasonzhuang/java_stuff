package inetAddress;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class EchoServer {
	public static void main(String[] args) {
		try {
			ServerSocket s= new ServerSocket(8189);
			//wait for client connection
			Socket incoming = s.accept();
			try {
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();

				Scanner in = new Scanner(inStream);
				PrintWriter out = new PrintWriter(outStream, true);
				out.println("Hello ! Enter BYE to exit");
				
				//echo client input
				boolean done = false;
				while (!done && in.hasNextLine()) {
					String line = in.nextLine();
					out.println("Echo: " + line);
				}
			}finally {
				incoming.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
