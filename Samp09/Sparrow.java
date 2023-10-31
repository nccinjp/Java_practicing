package Samp09;

//スズメクラス
public class Sparrow extends Bird{

    public Sparrow(){
        super("雀");
    }

    @Override
    public void sing(){
        System.out.println("チュンチュン");
    }

}
