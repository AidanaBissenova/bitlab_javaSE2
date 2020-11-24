package task2;

import javax.swing.*;

public class Frame extends Thread{
    public JLabel label;
    int x=5;
    int y=5;

    public Frame(JLabel label) {
        this.label = label;
    }

    public void run(){
        try {
            for (int i = 0; i < 300; i++) {
                label.setLocation(x, y);
                x+=20;
                y+=10;
                Thread.sleep(100);
            }
        }
        catch (Exception a){
            a.printStackTrace();
       }
    }

}
