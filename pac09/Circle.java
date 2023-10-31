package pac09;

public class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return (radius*radius*Math.PI);
    }

    public double getRound(){
        return (radius*2*Math.PI);
    }

}
