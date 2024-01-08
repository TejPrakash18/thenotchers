package Oops.Inheritence.Excercise1;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea(){
        return  Math.PI *radius *radius;
    }
}
