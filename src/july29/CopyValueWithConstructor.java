package july29;

        // we can copy value of one object to another by copy constructor
class Walmart {
            String locations;
            int EmployeeNo;
            int salary;
            String clothbrand;
            public Walmart(String l,int e,int s,String c) {
                locations = l;     // constructor to initialise integer and string
                EmployeeNo = e;
                salary = s;
                clothbrand = c;
            }
            public Walmart(Walmart W) {  // constructor to initialise the other object
                locations = W.locations;
                EmployeeNo = W.EmployeeNo;
                salary = W.salary;
                clothbrand = W.clothbrand;
            }
            public void getWalmart()
            {
                System.out.println(locations+ " "+EmployeeNo+" "+salary+" "+clothbrand);

            }
        }
public class CopyValueWithConstructor {
    public static void main(String[] args) {
        Walmart srt=new Walmart("Erinmills",2000,30000,"George");
        Walmart srt1= new Walmart(srt); // create object and passing value of another object
        srt.getWalmart();
        srt1.getWalmart();
    }
}
