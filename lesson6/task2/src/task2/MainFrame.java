package task2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainFrame extends JFrame{
    private JButton button;
    private JLabel label;


    public MainFrame() {
        Scanner in = new Scanner(System.in);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);
        setLayout(null);
        label = new JLabel("#");
        label.setSize(30,30);
        add(label);
        button = new JButton("FIRE");
        button.setSize(100,50);
        button.setLocation(80,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Frame f = new Frame(label);
               f.start();            }
        });
        add(button);
    }
}
