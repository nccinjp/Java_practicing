package Samp09;

//カラスクラス
public class Crow extends Bird {

    public Crow(){
        super("カラス");
    }

    @Override
    public void sing(){
        System.out.println("カーカー");
    }

    public void method(){
        System.out.println("カラスクラスのみに定義されているメソッド。");
    }
}
