package Samp12;

import java.util.ArrayList;

public class Lst12_1 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("Alex");   //要素追加
        al.add("Bryant");
        al.add("Cathy");
        System.out.println("第一個要素" + al.get(0));
        System.out.println("第三個要素" + al.get(2)+ "\n");

        int i = 1;
        for(String str : al){
            System.out.println( i + "是" + str );
            i++;
        }




    }
}
