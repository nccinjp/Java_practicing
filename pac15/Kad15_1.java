package pac15;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Kad15_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日");

        System.out.printf("現在の日付は" + sdf.format(cal.getTime()) + "です。\n");
        try{
            System.out.print("何日進めますか？＞");
            int addDay = Integer.parseInt(sc.next());
            cal.add(Calendar.DATE,addDay);
            System.out.println(addDay + "日後の日付は" + sdf.format(cal.getTime()));
        }catch(NumberFormatException NFE){
            System.out.println("入力値が不正です");
        }
    }
}
