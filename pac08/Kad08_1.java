package pac08;
import java.util.Scanner;
/* SK1A 陳鏡宇*/
public class Kad08_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Calculate cal = new Calculate();

        try{
            System.out.print("整数1＞");
            int num1 = Integer.parseInt(sc.next());
            System.out.print("整数2＞");
            int num2 = Integer.parseInt(sc.next());
            System.out.println("結果：" + cal.add(num1,num2));

        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です。");
        }
            System.out.print("\n文字列1＞");
            String str1 = sc.next();
            System.out.print("文字列2＞");
            String str2 = sc.next();
            System.out.println("結果：" + cal.add(str1,str2));

    }
}
