package pac13;

import java.io.*;
import java.net.URL;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Kad13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        final String READFILENAME = "ECCcompURL.txt";		//読み取るファイル名
        final String WRITEFILENAME = "ECCcompHTML.html";	//書き込むファイル名
        //2
        InputStream is = null;	//読み取り用ストリーム
        OutputStream os = null;	//書き込み用ストリーム
        System.out.println("読み取ったURLに接続してHTMLファイルを作成します。");

        //【ファイル読み取り処理】
        try{
            is = new FileInputStream(READFILENAME);
            int data;
            String urlText ="";
            while((data = is.read()) != -1){
                //System.out.print((char)data);		//char型へキャストし連結する
                urlText += (char)data;
            }
            System.out.println("接続先：" + urlText);

            URL url = new URL(urlText);
            is = url.openStream();

            //6 【ファイル書き込み処理】
            os = new FileOutputStream(WRITEFILENAME);

            //7
            int len;
            byte[] b = new byte[1024];
            while((len = is.read(b)) != -1){
                os.write(b, 0, len);	//b配列の0~lenバイト数をosストリームに書き込む
            }
            System.out.println("作成完了しました。");

        }catch(IOException ioe){	//IOExceptionのインポートも行うこと
            System.out.println(ioe);
            System.out.println("作成失敗しました。");
        }finally{
            //⑧
            //InputStreamクローズ処理
            if(is != null){
                try{
                    is.close();
                }catch(IOException ioe){
                    System.out.println(ioe);
                }
            }
            //OutputStreamクローズ処理
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
