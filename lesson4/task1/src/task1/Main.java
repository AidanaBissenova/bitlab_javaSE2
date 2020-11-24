package task1;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USERS");
            System.out.println("PRESS [4] TO EXIT");
            int ch = in.nextInt();
            if(ch==1){
                System.out.println("Insert id");
                String id=in.next();
                System.out.println("Insert login");
                String login = in.next();
                System.out.println("Insert password");
                String password =in.next();
                User u1= new User(id,login,password);
                ArrayList<User> users = getUserList();
                users.add(u1);
                saveUsersList(users);
            }
            else if(ch==2){
                ArrayList<User> users=getUserList();
                for(int i=0; i<users.size(); i++){
                    System.out.println(users.get(i));
                }
            }
            else if(ch==3){
                System.out.println("Insert index ");
                int index =in.nextInt();
                ArrayList<User> users = getUserList();
                users.remove(index);
                saveUsersList(users);
            }
            else{
                break;
            }
        }

    }
    public static ArrayList<User> getUserList(){
        ArrayList<User> users = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String message = "";
            while((message=br.readLine())!=null){
                String login= br.readLine();
                String password =br.readLine();
                users.add(new User(message,login,password));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }
    public static void saveUsersList(ArrayList<User> users){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt"));
            for(int i=0; i<users.size(); i++){
                bw.write(users.get(i).id+"\n");
                bw.write(users.get(i).login+"\n");
                bw.write(users.get(i).password+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
