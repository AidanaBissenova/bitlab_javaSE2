package task2;
import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private FirstPage firstPage;
    private SecondPage secondPage;
    private Students[] students = {
            new Students(1,"Cristiano","Ronaldo","Juventus","is"),
            new Students(2,"Eden","Hazard", "Real Madrid","kz"),
            new Students(3,"Leo"," Messi", "Barcelona","rus"),
            new Students(4,"Kylian"," Mbappe", "PSG","rus"),
            new Students(5,"Neymar"," Jr", "PSG","eng")

    };
    public MainFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500,500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        firstPage = new FirstPage(this);
        firstPage.setVisible(false);
        add(firstPage);

        secondPage = new SecondPage(this);
        secondPage.setVisible(false);
        add(secondPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return firstPage;
    }

    public SecondPage getSecondPage() {
        return secondPage;
    }

    public Students[] getStudents(){
        return students;
    }
    public void setStudents(Students[] students) {
        this.students = students;
    }
}

