package july29;
 // create more than one constructor with different parameters

class Customer {
    String name;
    String company;
    String dept;
    int salary;

    public Customer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Customer(String dept, int salary) {
        this.dept = dept;
        this.salary = salary;
    }

    public void getCustomer() {
        System.out.println(name + " " + company );

    }
    public void getCustomer1()
    {
        System.out.println(dept +" "+salary);
    }
}
    public class ConstructorOverloading {
    public static void main(String[] args) {
        Customer s1=new Customer("piyali","Walmart");
        Customer s2= new Customer("manager",20000);
        s1.getCustomer();
        s2.getCustomer1();

    }
}
