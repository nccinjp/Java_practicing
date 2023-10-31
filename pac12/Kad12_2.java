package pac12;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Kad12_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("HashMapで英和辞典を作ります");

        HashMap<String, String> dictionary = new HashMap<>();
        while(true)
            try{
                System.out.print("[0->終了 1->追加 2->表示 3->検索 4->削除 5->全件削除]＞");
                int num = Integer.parseInt(sc.next());

                if(num == 1 ){
                    System.out.print("追加する英単語＞");
                    String en = sc.next();
                    System.out.print("英単語の和訳＞");
                    String tra = sc.next();
                    dictionary.put(en,tra);

                }else if(num == 2){
                    Iterator<String> dicIter = dictionary.keySet().iterator();
                    while (dicIter.hasNext()){  //要素アリの時、true
                        String key = dicIter.next(); //次のキーを取り出し
                        System.out.println(key + " : " + dictionary.get(key));
                    }

                }else if(num == 3){
                    System.out.print("検索する英単語＞");
                    String en = sc.next();
                    System.out.print("英単語の和訳：");
                    System.out.print(dictionary.get(en) + "\n");

                }else if(num == 4){
                    System.out.print("削除する英単語＞");
                    String en = sc.next();
                    dictionary.remove(en);

                }else if(num == 5){
                    //Iterator<String> dicIter = dictionary.keySet().iterator();
                    System.out.println("全件削除しました。");
                    dictionary.clear();

                }else if(num == 0) {
                    System.out.print("終了します。");
                    break;
                }
            }catch (NumberFormatException NFE) {
                System.out.println("入力値が不正です");
            }
    }
}
