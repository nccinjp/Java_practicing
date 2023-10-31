package pac03;

public class Bank {
    int balance = 1000;
    public void showBalance(){
        System.out.println("残高：" + balance + "円。");
    }

    public void deposit(int money){
        //引数で受け取った金額を残高に加える。
        balance += money;
    }

    public void drawer(int money){
        //引数で受け取った金額を残高から差し引く。
        balance -= money;
    }

    public boolean checkBalance(int money){
        if(money > balance){
            return true;
        }
        return false;
    }

}


