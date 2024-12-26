package Properties.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomListArray{

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomListArray(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length*2];
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];

    }

    public int size(){
        return size;
    }

    public void set(int index,int value ){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList { "+
        " data= "+Arrays.toString(data)+
        ", size= "+ size + 
        '}';
    }
    public static void main(String[] args){
        CustomListArray list = new CustomListArray();

        // list.add(5);
        // list.add(60);
        // list.add(42);
        // list.add(23);

        for(int i=0;i<18;i++){
            list.add(i*2);
        }
        System.out.println(list);
    }
}