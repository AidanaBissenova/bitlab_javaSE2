package task2;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("PRESS [1] TO ADD GOOD");
            System.out.println("PRESS [2] TO LIST GOODS");
            System.out.println("PRESS [3] TO DELETE GOOD");
            System.out.println("PRESS [0] TO EXIT");
            int ch = in.nextInt();
            if(ch==1){
                System.out.println("Insert name");
                String name = in.next();
                System.out.println("Insert price");
                int price =in.nextInt();
                GoodItem gi1= new GoodItem(name, price);
                ArrayList<GoodItem> goodItems = getGoodItemList();
                goodItems.add(gi1);
                saveGoodItems(goodItems);
            }
            else if(ch==2){
                ArrayList<GoodItem> goodItems=getGoodItemList();
                for(int i=0; i<goodItems.size(); i++){
                    System.out.println(goodItems.get(i));
                }
            }
            else if(ch==3){
                System.out.println("Insert index ");
                int index =in.nextInt();
                ArrayList<GoodItem> goodItems = getGoodItemList();
                goodItems.remove(index);
                saveGoodItems(goodItems);
            }
            else{
                break;
            }
        }
    }
    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("goodItems.txt"));
            String message = "";
            while((message=br.readLine())!=null){
                int  price= Integer.parseInt(br.readLine());
                goodItems.add(new GoodItem(message,price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return goodItems;

    }
    public static void saveGoodItems(ArrayList<GoodItem> goodItems){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("goodItems.txt"));
            for(int i=0; i<goodItems.size(); i++){
                bw.write(goodItems.get(i).name+"\n");
                bw.write(goodItems.get(i).price+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
