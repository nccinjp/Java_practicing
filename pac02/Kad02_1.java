package pac02;

public class Kad02_1 {
    public static void main(String[] args){
        Car car = new Car();  //讀取Car.java的檔案
        System.out.println("分類：" + car.type);
        System.out.println("ガソリン(L)：" + car.gasoline);
        System.out.println("最高速度(㎞)：" + car.maxSpeed);
    }
}
