package pac10;
/*
SK1A
陳鏡宇
*/

import java.util.Scanner;
public class Kad10_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Radio radio = new Radio();

        System.out.println("ラジオを操作します。\n");

        while(true){
            try {
                System.out.print("[0->終了 1->電源ON/OFF]＞");
                int num = Integer.parseInt(sc.next());

                if(num == 0){
                    System.out.println("終了します。");
                    break;
                }else if (num == 1) {
                    if(radio.isPower()){
                        System.out.println("電源:OFF");
                        radio.powerOff();
                    }else{
                        System.out.println("電源:ON");
                        radio.powerOn();
                    }
                }else{
                    System.out.println(" ");
                }
            }catch (NumberFormatException NFE) {
                   System.out.println("入力値が不正です。");
            }
        }
    }
}
