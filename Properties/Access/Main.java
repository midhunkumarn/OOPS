package Properties.Access;

public class Main{
    public static void main(String[] args){
        A obj = new A(55,"mahii");
        obj.SetNum(75);
        System.out.println("Number : " + obj.getNum());
        // obj.getNum();
    }
}