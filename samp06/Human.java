package samp06;

public class Human extends Ape{   //サブクラス
    String item =" computer " ;    //フィールド

    public void talk(){
        System.out.println(" Hello ");
    }

    public void eatAndSleep(){
        //super class のメンバにアクセス
        System.out.println(favorite + " eats ");
    }

    @Override  //有加沒加都不會有error Apeクラスのsleepメソッドをオーバーライド
    public void sleep(){
        System.out.println("ハンモックつきで");
        super.sleep();
    }
}
