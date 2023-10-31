package samp03;

public class Person {
    static int counter = 0; //オブジェクトの個数

    String name = "Lucy";
    int age = 0 ;

    public Person(){
        counter++;
    }   //★

    public Person(String name, int num) {
        this();             //★のコンストラクタを呼んでいる
        this.name = name ;   //加了this.name 是指class　Person的
        this.age = age ;
    }

    //コピーコンストラクタ
    //オブジェクトの複製が作れる
    public Person(Person copy){
        this(); //★のコンストラクタを呼んでいる
        name = copy.name;
        age = copy.age;
    }

    public void showInfo(){             //no　static　動的メソッド
        System.out.print(name + " " + age+ "才" );      }

    public static void showCount(){      //静的メソッド
        System.out.println("作成したPersonのオブジェクトの数は" + counter + '\n' );   }
}
