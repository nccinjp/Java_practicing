package Samp11;

public class Person {
    private int age;

    public void setAge(int age) throws NotPositiveIntException {
        if(age < 0){
            //例外をスロー
            throw new NotPositiveIntException ("0以下の整数値が指定されています。指定値：" + age);
        }else{
            this.age = age;
        }

    }
}
