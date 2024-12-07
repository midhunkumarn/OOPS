class Car{
    String name;
    int Modelnum;
    String type;

    Car(){
        this ("Kia",2023,"pertole");
    }
    

    Car(String name, int Modelnum, String type){
        this.name = name;
        this.Modelnum = Modelnum;
        this.type = type;
    }

    
}

public class oops1 {
    public static void main(String[] args) {
       Car audiCar = new Car("Audi Q7", 2024,"Petrol");
        Car bmw = new Car("BMW", 2021,"Disel");

        Car kia = new Car( );


        System.out.println(kia.name);
        System.out.println(kia.Modelnum);
        System.out.println(kia.type);
    }
    
}
