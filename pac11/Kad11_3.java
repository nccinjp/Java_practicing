package pac11;

public class Kad11_3 {
    public static void main(String[] args ){

        try{
            Input input = new Input();
            System.out.print("名前：" );
            String name = input.getLetterString();
            System.out.print("年齢：");
            int age = input.getPositiveInt();
            System.out.println("名前：" + name);
            System.out.println("年齢："+ age);

        }catch(NotLetterException q){
            System.out.println(q);
        }catch(NumberFormatException n){
            System.out.println(n);
        }catch (NegativeException a){
            System.out.println(a);
        }

    }
}
