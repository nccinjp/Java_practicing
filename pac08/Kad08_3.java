package pac08;
/* SK1A 陳鏡宇*/
import java.util.Scanner;
import java.util.Random;

public class Kad08_3 {
    public static void main (String[] args){
        Calculate calc = new Calculate();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //入力値代入配列
        int[] inNums = new int[4];

        //2~4の乱数を生成して、int型変数inCountに代入する。
        int inCount = random.nextInt(3)+2;
        System.out.println(inCount + "回整数を入力して積を求めます。");

        try{
            for(int i = 1 ; i <= inCount ; i++){
                System.out.print("整数" + i + "＞");
                inNums[i-1] = Integer.parseInt(sc.next());
                //calc.mul(inNums[0],inNums[1],inNums[2],inNums[3]);
            }
            if(inCount == 2){
                System.out.print("積：" + calc.mul(inNums[0],inNums[1]));
            }
            if(inCount == 3){
                System.out.print("積：" + calc.mul(inNums[0],inNums[1],inNums[2]));
            }
            if(inCount == 4){
                System.out.print("積：" + calc.mul(inNums[0],inNums[1],inNums[2],inNums[3]));
            }
        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です。");
        }
    }
}
