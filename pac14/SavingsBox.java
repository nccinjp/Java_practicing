package pac14;

public class SavingsBox {
    private int savings = 0;

    public synchronized void saveMoney(int money,String name){

        savings += money ;
        System.out.println( name + "が貯金しました。貯金額：" + getSavings() + "円");

    }

    public int getSavings(){
        return  savings;
    }

}
