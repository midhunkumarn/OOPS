import java.util.*;

class Account {

  String name;
  int acc;
  int bal;

  Account(String name, int acc, int bal){
    this.name = name;
    this.acc = acc;
    this.bal = bal;
  }

  void Deposite(int balance){
    bal += balance;
    System.out.println("Successfully Deposited...");
    System.out.println("Your Deposited Amount is : "+ bal);
  }

  void Withdraw(int amou){
    bal-=amou;
    System.out.println("Your Balance is : ");
    System.out.println("Name : "+name);
    System.out.println("Account Number : "+ acc);
    System.out.println("Balance Amount : "+bal);
  }
    
}
public class proj2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Account gen = new Account("Midhun",775, 1000000000);

      System.out.println("If you want to Withdraw your amount Enter 1");    
      System.out.println("If you want to deposite your amount Enter 2 ");
      // System.out.println("If you want to Create Account Enter 3 ");

      int a = scan.nextInt();
      if(a==1){
        System.out.println("Enter your withdrawal amount : ");
        int wi = scan.nextInt();
        gen.Withdraw(wi);
      }
      
     if(a==2){
        System.out.println("Enter your Deposite Amount : ");
        int dep = scan.nextInt();
        gen.Deposite(dep);
      }
    }
    
}
