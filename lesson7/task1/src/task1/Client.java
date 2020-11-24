package task1;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("127.0.0.1", 1989);

            ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inStream =
                    new ObjectInputStream(socket.getInputStream());
            System.out.println("name:");
            String name =in.next();
            while(true) {
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int ch = in.nextInt();
                if (ch == 1) {
                    System.out.println("Insert message text:");
                    String text = in.next();
                    Date date = new Date();
                    MessageData m = new MessageData(name, text, date);
                    outStream.writeObject('"'+ m.messageText+'"' +" from "+ m.userName+" at "+m.sentDate); ;
                } else {
                    outStream.writeObject(null); ;
                    break;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
