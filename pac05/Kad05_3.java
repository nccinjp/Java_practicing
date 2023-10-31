package pac05;

import java.util.*;
public class Kad05_3 {
    public static void main(String[] args){
        Account ac = new Account("ECC","qwe123");
        Scanner sc = new Scanner(System.in);

        System.out.println("*** 初回認証 ***\n");

        while(true) {
            System.out.print("初期ユーザー名：" );
            String name = sc.next();
            System.out.print("初期パスワード：" );
            String pass = sc.next();
            if(ac.certify(name,pass)){
                break;
            }

        }

        System.out.println("\n*** アカウント登録 ***");
        System.out.print("新しいユーザー名＞");
        ac.setName(sc.next());
        System.out.print("新しいパスワード＞");
        ac.setPass(sc.next());


        System.out.println("\n*** 再認証 ***");
        while(true){
            System.out.print("ユーザー名＞");
            String inname = sc.next();
            System.out.print("パスワード＞");
            String inpass = sc.next();
            if(!ac.certify(inname,inpass)){
                continue;
            }else{
                break;
            }
        }











    }
}
