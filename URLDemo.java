import java.net.MalformedURLException;
import java.net.URL;
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.greeksforgreeks.org/java");
            System.out.println(url);
            System.out.println("protcol:" + url.getProtocol());
            System.out.println("HostName:" + url.getHost());
            System.out.println("Port Number:" + url.getPort());
            System.out.println("FileName:" + url.getFile());
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
}