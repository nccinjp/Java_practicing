package pac07;

public class Card {
    private String name;
    private int age;
    private String rank;
    private int point = 100 ;

    public Card(String name,int age, String rank){
        //各フィールドに引数を代入する。
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    //カード情報（名前・年齢・階級・ポイント）を表示する。
    public void showInfo(){
        System.out.println("*** カード情報 ***");
        System.out.println("名前 ：" + name);
        System.out.println("年齢 ：" + age);
        System.out.println("階級 ：" + rank);
        System.out.println("Point：" + point);
    }

    public int ascValue(int price){
        return (int)(price * 0.05);
    }

    public void addPoint(int point){
        //引数の値をフィールドpointに加算する。
        this.point += point;

    }

}
