package pac09;
/* SK1A 陳鏡宇*/
import java.util.Scanner;
public class Kad09_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("正方形と正三角形の面積を求めます。");
            System.out.print("一辺の長さ[m]＞");
            double side = Double.parseDouble(sc.next());
            Square sq = new Square(side);
            System.out.println("正方形の面積：" + sq.getArea() + "㎡");
            Triangle tr = new Triangle(side);
            System.out.println("正三角形の面積：" + tr.getArea() + "㎡");

        } catch (NumberFormatException NFE) {
            System.out.println("入力値が不正です。");
        }

    }
}
