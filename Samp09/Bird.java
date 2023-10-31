package Samp09;

//抽象クラス(bird class)
public abstract class Bird {
    private String name;

    public Bird(String name){         //コンストラクタ
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //鳴く(抽象method),因為每種動物叫法不同
    public abstract void sing();


}
