package samp15;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Lst15_1 {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        //現在日付の取得
        Date date = cal.getTime();
        System.out.println("現在の日時：" + date);
        //to get the date of year,month,date
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        System.out.printf("Today is %d/%d/%d .\n",year,month,day);
        //% 符號 是時間點的初期化
        //printf <---　can read the text

        //the time of alright now
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        System.out.printf("Now is %02d:%02d:%02d .\n",hour,min,sec);
        //self birthday「year,month,date」
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR,1996);
        birthday.set(Calendar.MONTH, 6 - 1 );
        birthday.set(Calendar.DATE, 16);
        //birthday.set(1996,6-1,16);

        //the days between A AND B
        long diffDays = (cal.getTimeInMillis() - birthday.getTimeInMillis())
                        /(1000 * 60 * 60 * 24);

        //SimpleDateFormat
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(fmt.format(birthday.getTime()) + "~~~ "
                + fmt.format(cal.getTime()) + "までは、"
                + diffDays + "日間です。"
        );


    }
}
