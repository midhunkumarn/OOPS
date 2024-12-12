package Properties.Inheritance;

public class exten extends Box {
    int weight;

    public exten(){
       this.weight = 50;
    }

    public exten(int h, int w, int l, int weight){
        super(h,w,l);
        this.weight = weight;
    }
}


