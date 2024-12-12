package Properties.Inheritance;

public class IssudeBook extends Book{
    String borrower_name;
    String issued_date;
    String return_date;

    IssudeBook(String book_name, String author, String isbn,String borrower_name, String issued_date, String return_date){
        super(book_name, author, isbn);

        this.borrower_name = borrower_name;
        this.issued_date = issued_date;
        this.return_date = return_date;

    }

    public void display_issued_details(){
        super.displayDetails();

        System.out.println("Borrower Name : "+borrower_name);
        System.out.println("Issude Date : "+ issued_date);
        System.out.println("Return Date : "+ return_date);
    }
}
