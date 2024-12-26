package Properties.Generics;
import java.util.*;

public class LambdaFunctions {
    interface Operation{
        int operation(int a, int b);
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=1;i<7;i++){
        //     list.add(i*3);
        // }
        // list.remove(3);
        // list.forEach((item) -> System.out.println(item));

        Operation sum = (a,b) -> a+b;
        Operation product = (a,b) -> a*b;
        
        Operation subract = (a,b) -> a-b;

        LambdaFunctions calc = new LambdaFunctions();
        System.out.println(calc.operate(5, 6, product));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}
