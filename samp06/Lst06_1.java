package samp06;
//Main method
public class Lst06_1 {
    public static void main(String[] args){
        //Human h = new Human();
        Ape[] apes = {new Ape(),new Human()};

        //ポリモーフィズム
        for(Ape ape : apes){
            ape.sleep();
        }

        //親クラスのメンバにアクセスできる
        //System.out.println(h.favorite);
        //h.sleep();

        //新たに追加したメンバにアクセスできる
        /*
        System.out.println(h.item);
        h.talk();
        h.eatAndSleep();
         */


    }
}
