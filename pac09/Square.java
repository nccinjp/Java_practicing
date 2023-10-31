package pac09;

public class Square extends Shape{
    private double side;

    public Square (double side){
        this.side = side ;
    }

    @Override
    public double getArea (){
        return (this.side*this.side);
    }
}
