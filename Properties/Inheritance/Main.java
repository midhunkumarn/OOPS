package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        // // Box box = new Box(80,40,60);
        // // Box box1 = new Box(box);

        // exten exe = new exten(70,80,90,100);

        // child2 chil = new child2(10,50,70,40);
        // System.out.println(chil.h +" "+chil.w+" "+chil.l+" "+chil.c);

        Book book = new Book("Money", "Jorge", "123456");
        System.out.println("Generall book Iformation : ");

        book.displayDetails();

        IssudeBook issudeBook = new IssudeBook("Money", "Jorge", "126345", "Midhun", "10/12/2024", "12/12/2024");
        System.out.println("Borrower Details : ");

        issudeBook.display_issued_details();
    }
}
