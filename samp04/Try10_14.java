package samp04;
import samp03.Person;

public class Try10_14 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.showInfo();

        Person p2 = new Person( "Lucy",10  );
        p2.showInfo();

        Person p3 = new Person(p2);
        p3.showInfo();

        //【注意！！】
        //Person p3 = p2;
        //としまうと、p3とp2は、同じオブジェクトを示すことになる。
        //よって、p2に変更をかけると、p3も変わってしまう。

        Person.showCount();

    }
}
