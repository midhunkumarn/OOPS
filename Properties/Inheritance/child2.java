package Properties.Inheritance;

public class child2 extends Box{
    int c;
    child2(int h, int w, int l, int c){
        super(h,w,l);
        this.c = c;

        System.out.println(super.w);
    }
}