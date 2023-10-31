package pac14;

public class Kad14_2 {
    public static void main(String[] args){
        SavingsBox savBox = new SavingsBox();
        BrotherThread olderThread = new BrotherThread(savBox,0);
        BrotherThread youngerThread = new BrotherThread(savBox,1);

        olderThread.start();
        youngerThread.start();

    }
}
