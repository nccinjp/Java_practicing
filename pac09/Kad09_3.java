package pac09;

import java.util.Scanner;
/* SK1A 陳鏡宇*/
public class Kad09_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("円の面積と円周を求めます。");
            System.out.print("半径の長さ[m]＞");
            double side = Double.parseDouble(sc.next());
            Circle cr = new Circle(side);
            System.out.println("面積：" + cr.getArea() + "㎡");
            System.out.println("円周：：" + cr.getRound() + "ｍ");

        } catch (NumberFormatException NFE) {
            System.out.println("入力値が不正です。");
        }

    }
}
