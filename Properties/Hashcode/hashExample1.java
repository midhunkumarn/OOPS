package Properties.Hashcode;

public class hashExample1 {
    int num;
    float digit;

    hashExample1(int num, float digit){
        this.num = num;
        this.digit = digit;
    }

    @Override
    public int hashCode(){
        return num;
    }

    @Override
    public boolean equals(Object obj1){
        return super.equals(obj1);
    }
}
