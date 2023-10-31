package Samp07;

public class SuperCar extends Car{
    public SuperCar(){
        type = " スポーツカー";
    }

    @Override
    void speedUp(int value){
        speed += value ;
        if(speed >= 300){        //limit 300
            speed = 300;
        }
    }

    @Override
    void speedDown(int value){
        value *=1.1 ;


    }

}
