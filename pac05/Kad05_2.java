package pac05;

import java.util.*;
public class Kad05_2 {
    public static void main(String[] args){
        Account ac = new Account("ECC","qwe123");
        Scanner sc = new Scanner(System.in);

        System.out.println("初期ユーザー名：" + ac.getName());
        System.out.println("初期パスワード：" + ac.getPass());
        System.out.println();


        System.out.println("*** アカウント登録 ***");
        System.out.print("新しいユーザー名＞");
        String name = sc.next();
        ac.setName(name);
        System.out.print("新しいパスワード＞");
        String pass = sc.next();
        ac.setPass(pass);

        System.out.println();
        System.out.println("*** アカウント情報 ***");
        System.out.println("ユーザー名：" + ac.getName());
        System.out.println("パスワード：" + ac.getPass());












    }
}
