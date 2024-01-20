import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class URLConnectionExample {
    public static void main(String[] args){
        try
{
    URL url=new URL("https://www.javatpoint.com/URLConnectionclass");
    URLConnection urlcon=url.openConnection();
    System.out.print(urlcon.getContentLength());
    System.out.print(urlcon.getConnectTimeout());
    System.out.print(urlcon.getContentType());
    System.out.print(urlcon.getDate());
    System.out.print(urlcon.getHeaderField(0));
    System.out.print(urlcon.getExpiration());
    InputStream stream=urlcon.getInputStream();
    int i;
    while((i=stream.read())!=-1) {
        System.out.print((char)i);
    }

}catch(Exception e) {
    System.out.print(e);
}
}
}
