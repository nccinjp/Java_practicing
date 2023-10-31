package pac02;

public class Kad02_2 {
    public static void main(String[] args){
        Car bigCar = new Car();  //讀取Car.java的檔案
        bigCar.type = "大型自動車" ;
        bigCar.gasoline = 350.0;
        bigCar.maxSpeed = 60;
        System.out.println("分類：" + bigCar.type);
        System.out.println("ガソリン(L)：" + bigCar.gasoline);
        System.out.println("最高速度(㎞)：" + bigCar.maxSpeed);
    }
}
