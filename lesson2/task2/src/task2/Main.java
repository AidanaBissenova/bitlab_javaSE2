package task2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Library[] libraries = new Library[2];
        libraries[0]=new Library("Aaa", "Astana");
        libraries[1] = new Library("Bbb", "Ata");
        for(int i=0; i<2; i++){
            int id= in.nextInt();
            String name=in.next();
            String author= in.next();
            Book book = new Book(id, name, author);
            libraries[0].addBook(book);
        }
        for(int i=0; i<3; i++){

            try {
                int id=in.nextInt();
                String name=in.next();
                String author= in.next();
                Book book = new Book(id, name, author);
                libraries[0].addBook(book);
            }catch (Exception e){
                e.printStackTrace();
                String x = in.next();
            }
        }
        libraries[0].printBooks();
        libraries[1].printBooks();
    }
}
