package Samp11;

import java.util.Scanner;
public class Lst11_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Input Age => ");

        try {
            int age = Integer.parseInt(sc.next());
            person.setAge(-10);
            System.out.println(age + "years old ");
        }catch(NotPositiveIntException | NumberFormatException e){
            System.out.print(e);
            //e.printStackTrace();
        }


    }
}
