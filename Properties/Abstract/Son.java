package Properties.Abstract;

public class Son extends Parent{

    @Override
    void hello(){
        super.hello(); 
    }

    
    @Override
    void Carrer(){
        System.out.println("Coder");
    }

    @Override
    void Partner(){
        System.out.println("I don't have.");
    }
    
}
