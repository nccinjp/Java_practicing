package pac14;

public class Kad14_1 {
    public static void main(String[] args){
        Thread threadA = new ThreadA();
        Runnable r = new ThreadB();

        Thread threadB = new Thread(r);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
