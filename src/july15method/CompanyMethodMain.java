package july15method;
import java.util.Scanner;
public class CompanyMethodMain {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("Enter the company name : " );
        String name = input.next();
        CompanyMethod.companyDetails(name);
        System.out.println("Enter the employee strenth: " );
        String num = input.next();
         CompanyMethod.companyDetails(num);
        System.out.println("Enter the employee salary: " );
        String sal = input.next();
        CompanyMethod.companyDetails(sal);



    }
}
