package Problems;
import java.util.*;

public class Pattern{
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
        
        for(int i = 0;i<name.length();i++){
            for(int j= 0;j<name.length();j++)
            {
               if(i==j || (i+j) == name.length()-1){
                System.out.print(name.charAt(i));
               }
               else
               System.out.print(" ");
            }
            System.out.println();
        }
    
}
}
