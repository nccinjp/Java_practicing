package pac06;

public class Animal {
    private int height;
    private int weight;

    public Animal(int height,int weight){
        this.height= height;
        this.weight= weight;
    }

    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    public void sleep(){
        System.out.println("寝る「スヤスヤ...zzz」");

    }

    public Animal(){

    }
}
