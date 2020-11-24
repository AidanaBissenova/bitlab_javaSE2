package task2;

public class Library {
    String name;
    String city;
    Book books[] = new Book[2];
    int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void addBook(Book book){
        try{
            books[index]=book;
            index++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println( "The library is full");
        }

    }
    public void printBooks(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(books[i].id + " " + books[i].name + " " + books[i].author);
            }
        }
        catch(NullPointerException e){
            System.out.println("The book is empty");
        }
    }
}
