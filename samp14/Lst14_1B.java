package samp14;

public class Lst14_1B {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyRunnable("thread01"));
        Thread t2 = new Thread(new MyRunnable("thread02"));

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
