import java.util.*;


class Student{

    String name;
    int roll;
    String dep;


    Student(String name, int roll, String dep){
        this.name = name;
        this.roll = roll;
        this.dep = dep;
    }

    void NamePrint(){
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + roll);
        System.out.println("Department : " + dep);
    }
}
public class proj1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        System.out.println("Enter your Roll Number : ");
        int roll = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Department : ");
        String dep = scan.nextLine();
       
        Student stu1 = new Student(name,roll,dep);
       
        stu1.NamePrint();
    }
}
