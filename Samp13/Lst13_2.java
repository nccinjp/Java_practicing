package Samp13;

import java.io.*;

public class Lst13_2 {
    public static void main(String[] args) {

        InputStream is = null;
        OutputStream os = null;

        try {
           is = new FileInputStream("orange.png");
           os = new FileOutputStream("orange_back.png");

           int len;                         //バッファに読み込まれたバイト数
           byte[] b = new byte[1024];       //バッファ

           while((len = is.read(b))!= -1){
               os.write(b,0,len);
           }

            System.out.println("done! ");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if(is != null){
                try{
                    is.close();
                }catch(IOException e){
                    System.out.println(e);
                }
            }
            if(os != null){
                try{
                    os.close();
                }catch(IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}