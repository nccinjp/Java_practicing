package pac10;
/*
SK1A
陳鏡宇
*/

public class Kad10_1 {
    public static void main (String[] args) {
        Radio radio = new Radio();
        System.out.println("ラジオの電源を確認します。");
        if(radio.isPower()){
            System.out.println("電源：ON" );
        }else{
            System.out.println("電源：OFF" );
        }
    }
}
