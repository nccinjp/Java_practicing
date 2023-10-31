package Samp12;

import java.util.HashMap;
import java.util.Iterator;

public class Lst12_2 {
    public static void main(String[] args){
        HashMap<String, String> hp = new HashMap<>();
        hp.put("1","Mon");
        hp.put("2","Tue");
        hp.put("3","Wed");
        hp.put("4","Thu");
        hp.put("5","Fri");
        hp.put("6","Sat");
        hp.put("7","Sun");

        for(String key : hp.keySet()){
            System.out.println(key + " : " + hp.get(key));
        }

        //iterator作業用這個
        Iterator<String> it = hp.keySet().iterator();
        while (it.hasNext()){  //要素アリの時、true
            String key = it.next(); //次のキーを取り出し
            System.out.println(key + " : " + hp.get(key));
        }

    }
}
