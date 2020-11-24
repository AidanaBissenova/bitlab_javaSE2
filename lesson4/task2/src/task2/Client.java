package task2;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("PRESS [1] TO LIST GOODS");
            System.out.println("PRESS [2] TO BUY GOOD");
            System.out.println("PRESS [3] TO LIST BUY HISTORY");
            System.out.println("PRESS [0] TO EXIT");
            int ch = in.nextInt();
            if(ch==1){
                ArrayList<GoodItem> goodItems=getGoodItemList();
                for(int i=0; i<goodItems.size(); i++){
                    System.out.println(goodItems.get(i));
                }
            }
            else if(ch==2){
                System.out.println("Insert index ");
                int index =in.nextInt();
                ArrayList<GoodItem> goodItems=getGoodItemList();
                String g2_name = goodItems.get(index).name;
                int g2_price = goodItems.get(index).price;
                ArrayList<BuyHistory> buyHistories = getBuyHistory();
                buyHistories.add(new BuyHistory(g2_name, g2_price));
                saveBuyHistory(buyHistories);
            }
            else if(ch==3){
                ArrayList<BuyHistory> buyHistories=getBuyHistory();
                for(int i=0; i<buyHistories.size(); i++){
                    System.out.println(buyHistories.get(i));
                }
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
    public static ArrayList<BuyHistory> getBuyHistory(){
        ArrayList<BuyHistory> buyHistories = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("buyHistory.txt"));
            String message = "";
            while((message=br.readLine())!=null){
                int  goodPrice= Integer.parseInt(br.readLine());
                String s = br.readLine();
                buyHistories.add(new BuyHistory(message,goodPrice));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return buyHistories;
    }
    public static void saveBuyHistory(ArrayList<BuyHistory> buyHistory){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for(int i=0; i<buyHistory.size(); i++){
                bw.write(buyHistory.get(i).goodName+"\n");
                bw.write(buyHistory.get(i).goodPrice+"\n");
                bw.write(buyHistory.get(i).buyTime+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
