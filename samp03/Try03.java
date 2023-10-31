package samp03;

public class Try03 {
    public static void main(String[] args){
        //personクラスのオブジェクトを１００個作る
        for(int i =0 ; i < 100;i ++){
            new Person();
        }
        Person.showCount();

        Person p1 = new Person();
        p1.name = "Apple";
        p1.age = 25 ;
        p1.showInfo();

        //Personクラスのcounterは、クラスに属している
        //name,ageは,インスタンスに属している。
    }
}
