package pac09;

public class Triangle extends Shape {
    private double side;

    public Triangle (double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return (this.side * this.side * Math.sqrt(3) / 4);
    }
}
