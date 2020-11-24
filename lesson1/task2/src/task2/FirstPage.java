package task2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JPanel {

    private MainFrame parent;
    private JButton button;
    private JLabel label;
    private JButton back;
    private JTextField textField;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox facultyBox;
    private String[] faculty = new String[5];
    int index=5;
    public FirstPage(MainFrame parent) {


        this.parent = parent;
        faculty[0]="IT";
        faculty[1]="XTOB";
        faculty[2]="SCE";
        faculty[3]="BS";
        faculty[4]="KMA";
        setSize(500,500);
        setLayout(null);


        label = new JLabel("Name:");
        label.setSize(300,30);
        label.setLocation(80,50);
        add(label);
        label = new JLabel("Surname:");
        label.setSize(300,30);
        label.setLocation(80,100);
        add(label);
        label = new JLabel("Faculty:");
        label.setSize(300,30);
        label.setLocation(80,150);
        add(label);
        facultyBox = new JComboBox(faculty);
        facultyBox.setSize(250,30);
        facultyBox.setLocation(180,150);
        add(facultyBox);
        label = new JLabel("Group:");
        label.setSize(300,30);
        label.setLocation(80,200);
        add(label);
        back = new JButton("Add");
        back.setSize(150,30);
        back.setLocation(80,300);
        add(back);
        back = new JButton("Back");
        back.setSize(150,30);
        back.setLocation(280,300);
        add(back);
        textField = new JTextField("Ilyas");
        textField.setSize(250,30);
        textField.setLocation(180,50);
        add(textField);

        textField2 = new JTextField("Zhuanyshev");
        textField2.setSize(250,30);
        textField2.setLocation(180,100);
        add(textField2);

        textField3 = new JTextField("D-04");
        textField3.setSize(250,30);
        textField3.setLocation(180,200);
        add(textField3);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                String text2 = textField2.getText();
                String faculty= (String) facultyBox.getSelectedItem();
                String text3 = textField3.getText();
                if(!text.equals("")){
                    //Делаем append, потому что мы хотим добавить новые элементы с сохранением старых данных. А \n нужен, чтобы каждая новая запись шла в новой строк
                    //Очищаем txtField и agesBox, после успешной операции
                    Students s = new Students(index, text, text2, faculty, text3);
                    index++;
                    textField.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    facultyBox.setSelectedIndex(0);
                }
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}