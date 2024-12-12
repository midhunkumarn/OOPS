package Properties.Inheritance;

public class Book {
    String book_name;
    String author;
    String isbn;

    Book(String book_name, String author, String isbn){
        this.book_name = book_name;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails(){
        System.out.println("Book Name : "+ book_name);
        System.out.println("Author Name : "+ author);
        System.out.println("isbn : " + isbn);
    }
}
