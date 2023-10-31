package pac15;

import java.util.Calendar;
import java.util.Scanner;

public class Kad15_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.println("今年のカレンダーを表示します");
        int year = cal.get(Calendar.YEAR);

        try{
            System.out.print("月(1~12)＞");
            int month = Integer.parseInt(sc.next());

            if(month > 0 && month <=12){
                cal.set(year, month - 1, 1);	//年, 月（月を0~11で管理している為、-1する）,日
                int week = cal.get(Calendar.DAY_OF_WEEK)-1; 	 	        //当月の初日の曜日番号を取得(日=1, 月=2 … 土=7)
                int days = cal.getActualMaximum(Calendar.DATE);	    //当月の最終日を取得(1月=31, 2月=28 or 29, 4月=30)
                //System.out.printf("%2d  ", 2);		        //nを右詰め2桁で表示（1= 1, 2= 2, 10=10, 31=31）

                String[] weeks= {"日","月","火","水","木","金","土"};
                System.out.printf("%12d年%d月",year,month);
                System.out.println("");

                for(String s:weeks) {
                    System.out.printf("%3s",s);
                }
                System.out.println();
                System.out.println("--------------------------");

                for(int i=0;i<week+days;i++) {
                    String str="";
                    if(i>=week) {
                        int date= i + 1 - week;
                        str=String.valueOf(date);
                    }
                    System.out.printf("%4s", str);
                    if((i+1) % 7 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();

            }else{
                System.out.println("入力値が範囲外です。");
            }
        }catch(NumberFormatException NFE){
        System.out.println("入力値が不正です");
        }
    }
}
