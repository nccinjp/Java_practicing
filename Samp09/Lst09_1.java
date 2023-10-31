package Samp09;

public class Lst09_1 {
    public static void main(String[] args){
        Bird[] bird = { new Crow(),new Sparrow() };

        for(Bird b : bird){
            System.out.print(b.getName() +  "：" );
            b.sing();

            if(b instanceof Crow){   //Crowのインスタンスの場合:true
                ((Crow)b).method();  //ダウンキャスト 因為裡面有super class 所以要降級
            }
        }
    }
}
