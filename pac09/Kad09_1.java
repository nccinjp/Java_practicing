package pac09;
import java.util.Scanner;
/* SK1A 陳鏡宇*/
public class Kad09_1 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);

            try{
                System.out.print("正方形の面積を求めます。");
                System.out.print("一辺の長さ[m]＞");
                double side = Double.parseDouble(sc.next());
                Square sq = new Square(side);
                System.out.println("正方形の面積：" + sq.getArea() + "㎡");

            }catch(NumberFormatException NFE){
                System.out.println("入力値が不正です。");
            }



    }

}
