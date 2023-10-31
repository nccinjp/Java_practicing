package pac11;
import Samp11.NotPositiveIntException;
import java.util.Scanner;

public class Input{

    //Scanner sc = new Scanner(System.in);
    //int num = Integer.parseInt();

    public int getNegativeInt () throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        if(num >= 0 ){
            throw new NumberFormatException();
        }else{
            return num;
        }
    }

    public int getPositiveInt ( ) throws NegativeException{
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        if (num < 0) {
            throw new NegativeException();
        } else {
            return num;
        }
    }


    public String getLetterString () throws NotLetterException{
        Scanner sc = new Scanner(System.in);
        //int num = Integer.parseInt(sc.next());
        String data = sc.next();
        for(int i = 0 ; i <data.length();i++){
            char a = data.charAt(i);
            if(Character.isLetter(a)== false)throw new NotLetterException();
        }
        return data;
    }
}

