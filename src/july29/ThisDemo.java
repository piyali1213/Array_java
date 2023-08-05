package july29;
class Car1{
  private String name;
    private String color;
    private double price;
    private String model;
public Car1()
{
    System.out.println("properties of the car");
}
    public Car1(String name, String color) {
       this();
        this.name = name;
        this.color = color;
    }

    public Car1(String name, String color, double price) {
        this(name,color);
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Car1(String name, String color, double price, String model) {
    this(name,color,price);
        this.name = name;
        this.color = color;
        this.price = price;
        this.model = model;
    }
    public void carPrint(){
        System.out.println(name+" "+color+" "+price+" "+model);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Car1 s1 =new Car1();
        Car1 s2 = new Car1("infinity","midnightBlue");
        Car1 s3 = new Car1("infinity","midnightBlue",55000);
        Car1 s4 = new Car1("infinity","midnightBlue",55000,"QX");

        s1.carPrint();
        s2.carPrint();
        s3.carPrint();
        s4.carPrint();


    }
}
