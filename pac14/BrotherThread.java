package pac14;

public class BrotherThread extends Thread{
    private SavingsBox savBox;
    private int brotherIndex;

    public BrotherThread (SavingsBox savBox,int brotherIndex){
        this.savBox = savBox;
        this.brotherIndex = brotherIndex;
    }

    @Override
    public void run (){

        final int TARGET = 30000;		//目標金額
        final int[] MONEYS = {4000, 2000};	//兄,弟が貯金する額
        final String[] NAMES = {"兄", "弟"};  //名前

        System.out.println( NAMES[brotherIndex] + "「Switch買う為に" + TARGET + "円貯金するぞ！」");

        while(true) {
            if(savBox.getSavings() >= TARGET) {
                System.out.println(NAMES[brotherIndex] + "「目標達成だ！」");
                break;
            }
            savBox.saveMoney(MONEYS[brotherIndex], NAMES[brotherIndex]);
                try {
                    Thread.sleep(1);
                }catch(InterruptedException ie){
                    System.out.println();
                }

        }
    }
}
