package pac01;

public class Kad01_1 {
    public static void main(String[] args){

        final int ARANK = 90;	//Aランクの下限値
        final int BRANK = 80;	//Bランクの下限値
        final int CRANK = 70;	//Cランクの下限値
        final int DRANK = 60;	//Dランクの下限値

        for(int i = 0 ; i <= 100 ; i +=10) {

            if (i >= ARANK){
                System.out.println(i + "点：A ランク");
            }else if(i < ARANK && i >= BRANK) {
                System.out.println(i + "点：B ランク");
            }else if(i < BRANK && i >= CRANK){
                System.out.println(i + "点：C ランク");
            }else if( i < CRANK  && i >= DRANK) {
                System.out.println(i + "点：D ランク");
            }else{
                System.out.println( i + "点：F ランク");
            }


        }  //for
    }
}
