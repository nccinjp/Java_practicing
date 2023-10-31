package pac14;

public class ThreadA extends Thread{
    public void run (){
        System.out.println("スレッドA:開始");
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("スレッドA：" + i);
            try{
                Thread.sleep(1);	  //引数は停止するミリ秒
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.println("スレッドA:終了");
    }
}
