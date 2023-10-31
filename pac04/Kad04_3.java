package pac04;
//作成者：SK1A 陳鏡宇
public class Kad04_3 {
    public static void main(String[] args){

         String  [] name = {"鈴木一朗","本田圭佑","北島康介"} ;
         int [] age  = {46,33,37};
         String  [] from = {"愛知県","大阪府","東京都"};

        System.out.println("*** プロフィール ***");

        for(int i = 0 ; i < 3; i++){
            Profile athlete = new Profile(name[i],age[i],from[i]);
            athlete.showProfile();
            System.out.println("");
        }



    }
}
