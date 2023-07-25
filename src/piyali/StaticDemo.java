package piyali;

public class StaticDemo {
    static double pi = 3.14;
    double radius;
    double area;

    void calculateArea(double r)
    {
        radius=r;
        area=radius*radius*pi;
        System.out.println("Area is " +area);
    }

    public static void main(String[] args) {
        StaticDemo a1= new StaticDemo( );
        StaticDemo a2= new StaticDemo( );
        a1.calculateArea(3);
        a2.calculateArea(2);
    }

}
