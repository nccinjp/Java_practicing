package samp14;

public class Counter {
    private int count;
    private Object lock = new Object();

    public Counter(){
        count = 0;
    }

    public synchronized void coutUp(String name){
        synchronized (lock){
            count++;
            System.out.println(name + " is count up "+count);
        }
    }
}
