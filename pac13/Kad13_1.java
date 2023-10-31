package pac13;
/*SK1A　陳鏡宇*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Kad13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        final String FILENAME = "ok.txt";
        //2
        File file = new File(FILENAME);

        //3
        try{
            if(file.createNewFile()){
                FileWriter fw = new FileWriter(file);
                System.out.println(FILENAME + "を作成しました。");
                System.out.print("書き込み文字列＞");
                String string = sc.next();
                fw.write(string);
                fw.close();

                FileReader fr = new FileReader(file);
                System.out.print("読み取り文字列：");
                int data;
                while((data = fr.read()) != -1){
                    System.out.print((char)data);	//文字型にキャストして表示する
                }
                    fr.close();	//FileReaderクローズ

            }else{
                System.out.println( FILENAME + "は既に存在しています");	//ファイル作成失敗

            }
        }catch(IOException ioe){  	//IOExceptionのインポートも行うこと
            System.out.println(ioe);
        }
    }
}
