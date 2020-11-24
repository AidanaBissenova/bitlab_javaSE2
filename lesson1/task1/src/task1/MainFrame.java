package task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JTextField textField2;
    private JComboBox agesBox;
    private Integer[] ages = new Integer[100];
    private JTextArea area;

    public MainFrame(){
        for(Integer i =0;i<100;i++){
            ages[i]= i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);
        setLayout(null);

        label = new JLabel("Name:");
        label.setSize(300,30);
        label.setLocation(80,50);
        add(label);
        label = new JLabel("Phone:");
        label.setSize(300,30);
        label.setLocation(80,100);
        add(label);
        label = new JLabel("Age:");
        label.setSize(300,30);
        label.setLocation(80,150);
        add(label);

        textField = new JTextField("Ilyas Zhuanyshev");
        textField.setSize(220,30);
        textField.setLocation(180,50);
        add(textField);

        textField2 = new JTextField("87022065555");
        textField2.setSize(220,30);
        textField2.setLocation(180,100);
        add(textField2);

        agesBox = new JComboBox(ages);
        agesBox.setSize(220,30);
        agesBox.setLocation(180,150);
        add(agesBox);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,300);
        add(area);
        button = new JButton("ADD CONTACT");
        button.setSize(300,30);
        button.setLocation(100,250);
        //Подвязываем объект интерфейса ActionListener к button
        button.addActionListener(new ActionListener(){
            //Так как мы не можем создавать объекты интерфейсов - нам приходится дописывать его абстрактные методы сразу тут
            public void actionPerformed(ActionEvent e){
                //Пишем, что должно произойти при нажатии на кнопку
                String text = textField.getText();
                String text2 = textField2.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!text.equals("")){
                    //Делаем append, потому что мы хотим добавить новые элементы с сохранением старых данных. А \n нужен, чтобы каждая новая запись шла в новой строке
                    area.append(text+" -" +text2+" -"+age+"\n");
                    //Очищаем txtField и agesBox, после успешной операции
                    textField.setText("");
                    textField2.setText("");
                    agesBox.setSelectedIndex(0);
                }

            }
        });
        add(button);
    }
}