package pac11;

public class Kad11_1 {
    public static void main (String[] args) {
        System.out.print("負の整数＞");
        try{
            Input input = new Input();
            System.out.println("入力値：" + input.getNegativeInt());

        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("入力値が不正です。");
        }

    }
}
