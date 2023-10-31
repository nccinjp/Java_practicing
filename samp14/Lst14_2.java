package samp14;

public class Lst14_2 {
    public static void main(String[] args){
        Counter counter = new Counter();

        CountUpThread t1 = new CountUpThread ();
        CountUpThread t2 = new CountUpThread ();

        /*
        t1.start();
        t2.start();

        try{
           t1.join();
           t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        */

    }
}
