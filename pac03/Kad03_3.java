package pac03;
//作成者：SK1A 陳鏡宇
// import java.awt.*;
import java.util.Scanner;

public class Kad03_3 {
    public static void main(String[] args){
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
            System.out.println("*** ECC銀行 ***\n");

        while(true) {
            try {

                System.out.println("--- MENU ---");
                System.out.println("1:預入れ");
                System.out.println("2:引出し");
                System.out.println("3:終了");
                System.out.print("＞");
                int num = Integer.parseInt(sc.next());

            if(num< 1 || 3 < num){
                System.out.println("その番号はそんざいしません。\n");
            }

                switch (num) {
                    case 1:
                        System.out.print("何円預入れますか？＞");
                        int money = Integer.parseInt(sc.next());
                        bank.deposit(money);
                        bank.showBalance();
                        break;

                    case 2:
                        System.out.print("何円引出しますか？＞");
                        money = Integer.parseInt(sc.next());
                        bank.drawer(money);
                        bank.showBalance();
                        break;

                    case 3:
                        System.out.println("終了します。");
                        System.exit(3);
                        break;

                }//switch

                if(num == 3){
                    break;
                }

            } catch (NumberFormatException NFE) {
                System.out.println("入力値が不正です。\n");

            } //try-catch
        } //while
    }
}
