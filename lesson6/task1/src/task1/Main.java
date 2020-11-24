package task1;

import java.util.Scanner;
import java.util.Spliterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        Operation o1 = new Operation("Add Client to Bank", 1);
        Operation o2 = new Operation("Delete Client", 4);
        Operation o3 = new Operation("Edit Client", 3);
        Operation o4 = new Operation("Info about  Client", 2);
        Operation o5 = new Operation("All Clients", 5);
        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}
