package pac06;
/* SK1A 陳鏡宇*/
public class Kad06_2 {
    public static void main(String[] args){
        Bird bird = new Bird();
        Dog d = new Dog();
        System.out.println(d.getType()+ "オブジェクトの動作");
        d.sleep();
        d.cry();

        System.out.println(bird.getType() + "オブジェクトの動作");
        bird.sleep();
        bird.cry();

    }

}
