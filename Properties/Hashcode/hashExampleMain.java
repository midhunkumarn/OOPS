package Properties.Hashcode;

public class hashExampleMain extends hashExample1 {

    hashExampleMain(int num, float digit){
        super(num, digit);
    }

    public static void main(String[] args) {
        hashExample1 obj = new hashExample1(55, 66.5f);
        hashExample1 obj1 = new hashExample1(55,66.5f);

        System.out.println(obj.equals(obj1));
      
        //hashcode sout is below one.
        System.out.println(obj.hashCode());
       
       //this is how can we identify wether it is sub class of one class using instanceof
        System.out.println(obj instanceof hashExample1);


        System.out.println(obj.getClass().getName());

    }
    
}
