package pac07;

public class SilverCard extends Card{
    public SilverCard (String name,int age){
        super(name, age, "シルバー");
    }

    @Override
    public int ascValue(int price){
        return (int)(price * 0.1);
    }

}
