import java.util.*;
class Library{
    String book_name;
    String book_author;
    int book_id;

    Library(String book_name, String book_author, int book_id){
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_id = book_id;
    }

    void ListBooks(){
        System.out.println("\n");
        System.out.println("BOOK NAME : "+book_name+"||" +" AUTHOR : "+book_author+"||"+" BOOK ID : "+book_id);
    }

    

}
public class proj3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Library> books = new ArrayList<>();

        books.add(new Library("The 5 Second Rule", "Mel Robbins", 1));
        books.add(new Library("The Alchemist","Paul Coelho", 2));
        books.add(new Library(" The American Spirit", "David McCullough", 3));
        books.add(new Library("The Art of Happiness ", "the Dalai Lama and Howard C. Cutler", 4));
        books.add(new Library("Becoming Wise: An Inquiry into the Mystery and Art of Living", "Krista Tippett", 5));


        System.out.println("Enter 1 to view books");
        System.out.println("Enter 2 issue book");
        System.out.println("Enetr 3 to return book");

        int a = scan.nextInt();
       
        if(a==1){
            System.out.println("Available Books are:");
            for(int i=0;i<books.size();i++){
            books.get(i).ListBooks();
           }
        }

        if(a==2){
            System.out.println("Available Books are:");
            for(int i=0;i<books.size();i++){
            books.get(i).ListBooks();
           }
           System.out.println("Enter the Book Id :");
           int book = scan.nextInt();
           System.out.println("Book Issued Successfully......");
           for(int i=0;i<books.size();i++){
            if(book !=books.get(i).ListBooks(book_id)){

            }
           }

        }


    }
}
