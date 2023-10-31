package pac06;

public class Dog extends Animal {
    private String type = "犬" ;

    public String getType(){
        return type;
    }

    public Dog(){

    }

    public void cry(){
        System.out.println("鳴く「ワンワン！」");
    }

    public Dog (String type,int height,int weight){
        super(height,weight);
        this.type = type;

    }




}
