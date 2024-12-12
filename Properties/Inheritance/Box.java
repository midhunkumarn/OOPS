package Properties.Inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l = 20;
        this.w = 40;
        this.h=10;
    }

    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(int l, int w, int h){
        this.l=l;
        this.w=w;
        this.h = h;
    }

    Box(Box news){
        this.h = news.h;
        this.l = news.l;
        this.w = news.w;

    }
}
