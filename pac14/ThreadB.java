package pac14;

public class ThreadB implements Runnable{

    @Override
    public void run (){
        System.out.println("スレッドB:開始");
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("スレッドB：" + i);
            try{
                Thread.sleep(1);	  //引数は停止するミリ秒
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.println("スレッドB:終了");
    }
}
