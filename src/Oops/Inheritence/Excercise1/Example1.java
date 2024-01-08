package Oops.Inheritence.Excercise1;

public class Example1 {
    public static void main(String[] args) {
            double r = 8.0;
            Circle c1 = new Circle(r);
            System.out.println("Radius of the circle = "+r);
            System.out.println("Perimeter: " + c1.getPerimeter());
            System.out.println("Area: " + c1.getArea());

            r = 3.2;
            Circle c2 = new Circle(r);
            System.out.println("\nRadius of the circle = "+r);
            System.out.println("Perimeter: " + c2.getPerimeter());
            System.out.println("Area: " + c2.getArea());
    }
}
