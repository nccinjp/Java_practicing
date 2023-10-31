package pac07;
/* SK1A 陳鏡宇*/
import java.util.Scanner;

public class Kad07_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GoldCard gd = new GoldCard("孫悟空",47,"ゴールド");
        gd.showInfo();

        try{
            System.out.print("\n購入金額＞");
            int price = Integer.parseInt(sc.next());
            gd.addPoint(gd.ascValue(gd.discount(price)));
            gd.showInfo();

        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です。\n");
        }


    }
}
