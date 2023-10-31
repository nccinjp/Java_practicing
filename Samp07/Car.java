package Samp07;

public class Car {
    protected String type;
    protected int speed= 0;

    public Car(){
        type="自動車";
    }

    //speed　UP
    void speedUp(int value){
        speed += value;
        if(speed >= 180){    //rule speed 180
            speed = 180;
        }
    }

    //speed down
    void speedDown(int value){
        speed -= value;
        if(speed <= -15){     //rule speed down 15
            speed = -15;
        }
    }

    //show speed
    public void showInfo(){
        System.out.println(type + " : " +speed+ " km/h");
    }


}
