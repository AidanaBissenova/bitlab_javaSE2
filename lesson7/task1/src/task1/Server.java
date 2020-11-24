package task1;
import org.w3c.dom.ls.LSOutput;

import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1989);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream =
                    new ObjectInputStream(socket.getInputStream());
            String message = "";
            while ((message = (String) inStream.readObject()) != null) {
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
