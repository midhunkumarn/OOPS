package Properties.ExceptionHandiling;

public class Main {
    public static void main(String args[]){
        int a =5;
        int b = 0;
        try{
            divide(a,b);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This will run after Error or any Exception throws");
        }
    }

    static int divide(int a, int b){
        if(b==0)
        throw new ArithmeticException("don't divide by zero");

        return a / b;
    }
}
