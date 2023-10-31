package pac11;

import Samp11.NotPositiveIntException;

public class Kad11_2 {
    public static void main (String[] args) {
        System.out.print("正の整数＞");

        try{
            Input input = new Input();
            System.out.println("入力値：" + input.getPositiveInt());

        }catch( NegativeException| NumberFormatException e){
            System.out.println(e);
            System.out.println("入力値が不正です。");
        }

    }
}
