package samp05;

public class Lst05_1 {
    public static void main(String[] args){
        PersonA p = new PersonA();

        p.setName("");
        p.setAge(-20);

        System.out.println(p.getName() + " "+ p.getAge() + "歳");

    }
}
