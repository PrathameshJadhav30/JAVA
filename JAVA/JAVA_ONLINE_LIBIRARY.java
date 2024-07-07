
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ "has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book : this.books){
            if (book==null){
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been Issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not Exist");
    }
}

public class JAVA_ONLINE_LIBIRARY {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.addbook("c++");
        obj.addbook("JAVA");
        obj.addbook("DBMS");
        obj.showAvailableBooks();
        obj.issueBook("JAVA");
        obj.showAvailableBooks();

    }
}
