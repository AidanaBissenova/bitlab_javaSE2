package task1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        User[] users= new User[5];
        int sum=0;
        for (int i=0; i< users.length;i++){
            String name2=in.next();
            String surname2=in.next();
            int age2;
            try {
                age2 = in.nextInt();
            }
            catch (Exception e){
                e.printStackTrace();
                age2=0;
                String x = in.next();
            }
            users[i]= new User(name2, surname2, age2);
            sum+=age2;
        }
        System.out.println(sum/users.length);
    }
}
