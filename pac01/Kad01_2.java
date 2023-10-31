package pac01;

public class Kad01_2 {
    public static void main(String[] args){
        final int SUM = 1333;

        for(int i = 0; i <= 9 ; i++){
            for(int j = 0; j <=9 ; j++){
                for(int k = 0; k <= 9 ; k++){
                    int num1 = i*100 + j*10 + k;
                    int num2 = k*100 + j*10 + i;
                    if( num1 + num2 == SUM){
                        System.out.println( (i*100)+ (j*10) + k + " + " + k + j + i  + " = " + SUM);
                    }
                }
            }
        }

    }
}
