package pac08;
import java.util.Scanner;
/* SK1A 陳鏡宇*/
public class Kad08_2 {
    public static void main (String[] args){
        Calculate calc = new Calculate();
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("実数1＞");
            double num1 = Double.parseDouble(sc.next());
            System.out.print("実数2＞");
            double num2 = Double.parseDouble(sc.next());
            System.out.print("実数3＞");
            double num3 = Double.parseDouble(sc.next());
            System.out.println("実数1+2の平均値：" + calc.getAverage(num1,num2));
            System.out.println("実数1+2+3の平均値：" + calc.getAverage(num1,num2,num3));

        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です。");
        }

    }
}
