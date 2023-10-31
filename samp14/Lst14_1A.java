package samp14;

public class Lst14_1A {
    public static void main(String[] args){
        MyThread t1 = new MyThread("thread01");
        MyThread t2 = new MyThread("thread01");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        }catch(InterruptedException e){
            System.out.print(e);

        }
        System.out.println("Main is finshed");
    }
}
