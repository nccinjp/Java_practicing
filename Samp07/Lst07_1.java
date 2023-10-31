package Samp07;

public class Lst07_1 {
    public static void main(String[] args){
        Car[] cars = {new Car(),new SuperCar()};

        for(int  i=0 ; i<8  ;i++){
            for(Car car : cars){
                car.speedUp(50);
                car.showInfo();
            }
        }

        for(int  i=0 ; i<8  ;i++){
            for(Car car : cars){
                car.speedDown(50);
                car.showInfo();
            }
        }




    }
}
