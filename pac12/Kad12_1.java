package pac12;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Kad12_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ArrayListで国名リストを作ります。");
        ArrayList<String> countryList = new ArrayList<>();
        int i = 1 ;
        while(true) {
            try {
                System.out.print("[0->終了 1->追加 2->表示 3->並び替え 4->削除 5->全件削除]＞");
                int num = Integer.parseInt(sc.next());
                if(num == 1){
                    System.out.print("追加する国名＞");
                    String name = sc.next();
                    countryList.add(name);

                }else if(num == 2 ){
                    for(String str : countryList){
                        System.out.println( str );
                        //i++;
                    }

                }else if(num == 3){
                    System.out.println("昇順に並び替えました。");
                    Collections.sort(countryList);	//昇順にソート

                }else if(num == 4){
                    System.out.println("削除する国名＞");
                    String name = sc.next();
                    countryList.remove(name);

                }else if(num == 5){
                    System.out.println("全件削除しました");
                    countryList.removeAll(countryList);

                }else if(num == 0){
                    System.out.print("終了します。");
                    break;
                }

            }catch (NumberFormatException NFE) {
                System.out.println("入力値が不正です");
            }
        }
    }
}
