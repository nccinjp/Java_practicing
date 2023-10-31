package Samp08;

public class Lst08_1 {
    public static void main (String[] args){
        /*
        Person p1 = new BilingualPerson();
        p1.sayHello();
        p1.sayMessage();
        */

        BilingualPerson p2 = new BilingualPerson();
        //override
        p2.sayHello();
        //overload
        p2.sayMessage();
        p2.sayMessage("How was your weekend?");

    }
}
