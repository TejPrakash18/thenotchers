package Oops.Interface;

public interface Polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon{
    public void getArea(int length, int breadth){
        System.out.println("the area of rectangle "+(length*breadth));
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.getArea(4, 6);
    }
}
