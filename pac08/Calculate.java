package pac08;

public class Calculate {
    public int add(int num1,int num2){
        return num1 + num2;
    }
    public String add(String str1,String str2){
        return str1+str2;
    }

    public double getAverage(double num1, double num2){
        return ( num1 + num2 )/ 2 ;
    }
    public double getAverage(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3 ;
    }

    public int mul(int num1,int num2){
        return num1*num2;
    }
    public int mul(int num1, int num2, int num3){
        return num1*num2*num3;
    }
    public int mul(int num1, int num2, int num3, int num4){
        return num1*num2*num3*num4;
    }

}
