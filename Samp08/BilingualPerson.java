package Samp08;

public class BilingualPerson extends Person{
    @Override
    public void sayHello(){
        System.out.println("Hello.");
    }

    public void sayMessage(String message){
        System.out.println(message);
    }
}
