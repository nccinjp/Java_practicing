package samp06;

public class Lst06_2 {
    public static void main(String[] args){
        //SubClass subC = new SubClass();　　　//引数ないの場、結果は1,1

        SubClass subC = new SubClass(100,200);  //引数アリの場100,200

        System.out.println("a = " + subC.getA());
        System.out.println("b = " + subC.getB());
    }
}
