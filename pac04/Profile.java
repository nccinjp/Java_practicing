package pac04;

public class Profile {
    String name;
    int age = 0;
    String from;
    String job;

    public Profile(String name, int age, String from) {
        this();
        this.age = age;
        this.name = name;
        this.from = from;
    }

    public Profile(){
        job ="スポーツ選手";
    }

    public void showProfile() {
        System.out.println("氏名：" + name);
        System.out.println("年齢：" + age);
        System.out.println("出身：" + from);
        System.out.println("職業：" + job);
    }



}


