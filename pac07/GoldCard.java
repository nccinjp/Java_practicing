package pac07;

public class GoldCard extends Card {

    private int border = 3000;
    private int bonusPoint = 200;

    public GoldCard(String name, int age,String rank) {
        super("孫悟空", 47, "ゴールド");
    }

    public int discount(int price) {
        return price =  (int)(price * 0.9);
    }

    @Override
    public int ascValue(int price) {

        if(price <= border){
           return  (int)((double) price* 0.2);

        }else{
            return (int)((double)price*0.2)+bonusPoint;
        }

    }
}
