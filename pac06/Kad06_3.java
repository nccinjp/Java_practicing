package pac06;
/* SK1A 陳鏡宇*/
import samp06.Ape;
import samp06.Human;

public class Kad06_3 {
    public static void main(String[] args){
        Dog shibainu = new Dog("柴犬", 35, 8);
        Dog chiwawa = new Dog("チワワ",23,3);
        Dog bulldog = new Dog("ブルドッグ",40,25);

        Dog[] dogs ={shibainu,chiwawa,bulldog};

        for (Dog dog : dogs){
            System.out.println(dog.getType()+ "オブジェクトの動作");

            dog.sleep();
            dog.cry();
            System.out.println(dog.getType()+"オブジェクトの属性");
            System.out.println("体高："+ dog.getHeight() + "cm");
            System.out.println("体重："+ dog.getWeight() + "kg\n");
        }


    }
}
