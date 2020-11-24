package task1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println(" PRESS [0] TO EXIT");
            int choice1 = in.nextInt();
            if(choice1==1){
                System.out.println("Name:");
                String name=in.next();
                System.out.println("Surname:");
                String surname= in.next();
                System.out.println("PRESS [1] TO ADD SUBJECT ");
                System.out.println("PRESS [0] TO GO TO MAIN MENU");
                while (true){

                    int choice2 = in.nextInt();
                    if(choice2==1){
                        ArrayList<Subject> subjects = new ArrayList<Subject>();
                        while(true) {
                            String name_subject = in.next();
                            if (name_subject.equals("exit")) {
                                break;
                            } else {
                                int credits = in.nextInt();
                                Subject s1 = new Subject(name_subject, credits);
                                subjects.add(s1);
                            }
                        }
                        Student student1 = new Student(name, surname, subjects );
                        ArrayList<Student> students = readStudents();
                        students.add(student1);
                        saveStudents(students);
                    }
                    else if(choice2==0){
                        break;
                    }
                }
            }
            else if(choice1==2){
                ArrayList<Student> students = readStudents();
                for(int i=0; i<students.size(); i++){
                    System.out.println(students.get(i));
                }
            }
            else {
                break;
            }
        }
        System.out.println(" ");
    }
    public static void saveStudents(ArrayList<Student> students){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            outStream.writeObject(students);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Student> readStudents(){
        ArrayList<Student> students = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            students = (ArrayList<Student>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return students;
    }
}
