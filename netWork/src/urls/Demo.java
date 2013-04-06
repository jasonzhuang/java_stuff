package urls;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.ibiblio.org/javafaq/javafaq.html?name=jason#xtocid1902914");
            System.out.println("the ref is " + url.getRef());
            System.out.println("the query is " + url.getQuery());
            System.out.println("the path is " + url.getPath());
            System.out.println("the host is " + url.getHost());
            System.out.println("the port is " + url.getPort());
            URL url2 = new URL("ftp://admin:1234@138.247.121.61:21000");
            System.out.println("the userInfo is " + url2.getUserInfo());
            URL url3 = new URL("http://www.google.com");
            try {
                System.out.println(url3.getContent().getClass().getName());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            try {
                InputStream in = url3.openStream();
                in = new BufferedInputStream(in);
                Reader r = new InputStreamReader(in);
                int c;
                while((c = r.read())!=-1) {
                    System.out.print((char)c);
                }
                r.close();//close stream
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
