import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class ServerClientDemo {
    public static void main(String[] args) {
    {
        try (
                Socket socket = new Socket("localhost", 1341);
                BufferedReader reader = new BufferedReader(new
                        InputStreamReader(System.in));
                PrintWriter writer = new
                        PrintWriter(socket.getOutputStream(), true);
                BufferedReader serverReader = new BufferedReader(new
                        InputStreamReader(socket.getInputStream()))
        ) {
            System.out.print("Enter a name to be translated to upper case:  ");
            String name = reader.readLine();
            writer.println(name);
            String translatedName = serverReader.readLine();
            System.out.println("Translated name received from server: " + translatedName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
}
