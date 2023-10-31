package samp14;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for(int i = 0; i <3 ;i++){
            System.out.println(name + "is moving：" + i );
            try{
                Thread.sleep(100);

            }catch(InterruptedException e ){
                System.out.println(e);
            }


        }
    }
}
