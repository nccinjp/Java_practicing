package pac01;

import java.util.*;
public class Kad01_3 {
    public static void main(String[] args){
        //問題配列
        final String[] QUIZ = {"ループを抜ける文は？",
                "配列の長さを取得する文は？",
                "例外処理の構文はtry-何？"};

        //選択肢配列
        final String[][] CHOICE = {{"continue", "return", "break"},
                {".length", ".height", ".count"},
                {"get", "catch", "exception"}};

        //各問題の解答番号
        final int[] ANSWER = {3, 1, 2};
        int k = 0;  //正解数の求める
        Scanner sc = new Scanner(System.in);
        System.out.println("Javaクイズ！\n");

        while(true){

            for(int i = 0 ; i < QUIZ.length ; i++){
                System.out.println("第"+ (i+1)+ "問" + QUIZ[i]);

                for(int j = 0 ; j < CHOICE[i].length ; j++){
                    System.out.println((j+1)+":"+CHOICE[i][j]);
                }

                    //answer
                    try{
                        System.out.print("＞");
                        int inNum = Integer.parseInt(sc.next());
                        //sentaku check
                        if(inNum > 0 && inNum < 4){
                            if(inNum == ANSWER[i]){
                                System.out.println("正解！\n");
                                i++;
                                k++;
                            }else{
                                System.out.println("不正解！答えは"+ ANSWER[i] + "です。\n");
                                i++;
                            }

                        }else {
                            System.out.println("その選択肢は存在しません。\n");
                        }
                    }catch(NumberFormatException NFE){
                        System.out.println("入力値が不正です。\n");
                    }
                    i--;

                }//quiz
            System.out.println("終了！3問中、" + k +" 問正解でした。");
            break;
        } //while
    }
}
