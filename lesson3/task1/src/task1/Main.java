package task1;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Players> list = new ArrayList<Players>();
        Players p1= new Players("Niko", 21000,20);
        Players p2= new Players("Josh", 40000,26);
        Players p3= new Players("Mark", 32000,25);
        Players p4= new Players("George", 54000,29);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        int sred=0;
        int sum_vozrasta=0;
        for(int i=0; i<list.size(); i++){
            sred += list.get(i).price;
            sum_vozrasta += list.get(i).age;
        }
        System.out.println(sred/list.size()+ " "+ sum_vozrasta);
    }
}
