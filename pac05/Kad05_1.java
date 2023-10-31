package pac05;

public class Kad05_1 {
    public static void main(String[] args){
        Account ac = new Account("ECC","qwe123");

        System.out.println("初期ユーザー名："+ac.getName());
        System.out.println("初期パスワード："+ac.getPass());
    }
}
