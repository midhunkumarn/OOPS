package Properties.Generics;



import java.util.Arrays;

public class WildCardExamples<T extends Number> {

    private Object[] arr;
    private int size;
    private static int DEFAULT_SIZE=10;

    public WildCardExamples(){
        this.arr = new Object[DEFAULT_SIZE];
    }
    public void getList(List <? extends Number> list){
        
    }

    public void add(float num){
            if(isFull()){
                resize();
            }
            arr[size++]=num;
    }

    private boolean isFull(){
        return size == arr.length;
    }

    public void set(int index, T value){
        arr[index]=value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)(arr[index]);
    }

    public T remove(int index){
        @SuppressWarnings("unchecked")
        T removed = (T)(arr[--size]);
        return removed;
    }

    public void resize(){
        Object[] temp = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = (arr[i]);
        }
        arr = temp;
    }

    @Override
    public String toString(){
        return "{ "+Arrays.toString(arr) +" "+ size+" }";
    }
    public static void main(String args[]){
        customArrayList<Number> list = new customArrayList<>();
        for(int i=1;i<20;i++){
            list.add(i*2.4f);
        }
        System.out.println(list);
    }
}
