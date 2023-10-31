package samp05;

public class PersonA {
    private String name;
    private int age;

    //コンストラクタ
    public PersonA(){
        name = "unknown";
        age = 0;
    }

    //setter method
    public void setName(String name) {
        if(name.isEmpty()){      //如果輸入的名字是空白
            System.out.println("name is blank.");
            return;
        }
        this.name = name ;
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("age is minus.");
            return;
        }
        this.age = age;
    }

    //getter method
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}
