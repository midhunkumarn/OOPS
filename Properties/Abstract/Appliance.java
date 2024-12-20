package Properties.Abstract;

public abstract class Appliance {
    
    abstract void turnOn();
    abstract void turnOff();
}

class Fan extends Appliance{
    

    @Override
    void turnOn(){
        System.out.println("fan is turn on");
    }

    @Override
    void turnOff(){
        System.out.println("fan is turn off");
    }
}

class Light extends Appliance{
    @Override
    void turnOn(){
        System.out.println("Light is turn on");
    }

    @Override
    void turnOff(){
        System.out.println("Light is turn off");
    }
}

class AirConditioner extends Appliance{

    @Override
    void turnOn(){
        System.out.println("AirConditioner is turn on");
    }

    @Override
    void turnOff(){
        System.out.println("AirConditioner is turn off");
    }
}


class AMain{

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();

        Light light = new Light();
        light.turnOn();

        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOff();
    }
}