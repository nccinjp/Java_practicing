package pac07;
import java.util.Scanner;
/* SK1A 陳鏡宇*/
public class Kad07_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SilverCard silvercard = new SilverCard("孫悟飯",27);
        silvercard.showInfo();

        try{
            System.out.print("\n購入金額＞");
            int price = Integer.parseInt(sc.next());
            silvercard.addPoint(silvercard.ascValue(price));
            silvercard.showInfo();

        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です。\n");
        }

    }
}
