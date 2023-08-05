package july29;
// we can copy the value of object by initialising value of obj to another object
class Emlpoyee1
{
    String name; String company; int id ; double salary ;

    public Emlpoyee1(String name, String company, int id, double salary) {
        this.name = name;
        this.company = company;
        this.id = id;
        this.salary = salary;
    }
    public Emlpoyee1(){

   }
    public void getEmployee1()
    {
        System.out.println(name+ " "+company+ " "+id+ " "+salary);
    }
}
public class CopyValueWithoutConstructor {
    public static void main(String[] args) {
        Emlpoyee1 s1=new Emlpoyee1("piyali","Walmart",101,234.56);
        Emlpoyee1 s2= new Emlpoyee1();
        s2.name=s1.name;           // initialised value of one object to another
        s2.company=s1.company;
        s2.id= s1.id;
        s2.salary=s1.salary;
        s1.getEmployee1();
        s2.getEmployee1();


    }
}
