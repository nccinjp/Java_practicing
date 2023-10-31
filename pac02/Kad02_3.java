package pac02;

public class Kad02_3 {
    public static void main(String[] args){
        final String[] TYPS = {"軽自動車", "スポーツカー"};
        final double[] GASS = {25.0, 70.0};
        final int[] SPEEDS = {100, 300};

        //②Carクラスをインスタンス化し、軽自動車用オブジェクトlightCarと、
        //スポーツカー用オブジェクトsportsCarを生成する。

        Car lightCar = new Car();
        Car sportsCar = new Car();

        //③Car型の配列carsを宣言し、{lightCar, sportsCar}を初期値として代入する。
        Car[] cars = {lightCar,sportsCar};

        //④for文を使用し、軽自動車とスポーツカーのオブジェクトの各フィールドに
        //それぞれの定数配列の値を代入して書き換える。

        for(int i = 0; i < cars.length ; i++){
            cars[i].type = TYPS[i];
            cars[i].gasoline = GASS[i];
            cars[i].maxSpeed = SPEEDS[i];
        }

        //⑤拡張for文を使用し、軽自動車とスポーツカーのオブジェクトの各フィールドを表示する。
        for(Car c:cars){
            System.out.println("分類："+c.type);
            System.out.println("ガソリン(L)："+c.gasoline);
            System.out.println("最高速度(㎞)："+c.maxSpeed);
            System.out.println(" ");
        }


    }
}
