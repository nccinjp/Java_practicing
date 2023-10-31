package pac03;
import java.util.Scanner;

public class Kad03_2 {
    public static void main(String[] args){
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("*** ECC銀行 ***");
        try{
            System.out.print("何円預入れますか？＞");
            int money = Integer.parseInt(sc.next());
            bank.deposit(money);
            bank.showBalance();

            System.out.print("何円引出しますか？＞");
            money = Integer.parseInt(sc.next());
            bank.drawer(money);
            bank.showBalance();

            if(bank.checkBalance(money)== true){
                bank.drawer(money);
                bank.showBalance();
            }else{
                System.out.println("残高が足りません。");
            }


        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です。\n");

        }
    }
}
