package Samp13;

import java.io.*;

public class Lst13_1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        FileWriter fw = null;
        FileReader fr = null;

        try {
            if (file.createNewFile()) {

                //書き込み処理
                fw = new FileWriter(file);        //書き込みFILE　OPEN
                fw.write("ECC Computer");     //書き込み
                fw.flush();


                //読み込み処理
                fr = new FileReader(file);
                int data;

                while ((data = fr.read()) != -1) {
                    System.out.println((char) data);
                } //while

            } else {
                System.out.println("file　wasn't done.");
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        finally {
            if (fw != null) {
                try {
                    fw.close();   //書き込み
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            if (fr != null) {
                try {
                    fr.close();   //読み込み
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

        }
    }
}