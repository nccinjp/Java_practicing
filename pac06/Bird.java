package pac06;

public class Bird extends Animal{
    private String type = "鳥";

    public String getType(){
        return type;
    }

    public void cry(){
        System.out.println("鳴く「チュンチュン！」");
    }

}
