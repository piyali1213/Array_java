package july8switchloop;
import java.util.Scanner;
public class CustomerService {
    public static void main(String[] args)
    {
        System.out.println("Thank you for calling Td customer service");

       //
       //
        System.out.println("for customer service press 1 ");
        System.out.println("for phone banking press 2 ");
        System.out.println("for credit card information press 3 ");
        System.out.println("for repeat the manu press 4 ");
        System.out.println("for  press 5 ");

        System.out.println("for repeat the menu press 5 ");
        Scanner input = new Scanner (System.in);
        System.out.println("Press the service number :");
        int cardnum = input.nextInt();



      // String ch = input.next();
        switch (cardnum ) {
            case 1:
                System.out.println("Welcome to td helpline ");

                break;
            case 2:
                System.out.println(" :Welcome to td phone banking:");
                System.out.println("Enter 4 letter access code ");
                String ch = input.next();

                break;
            case 3:
                System.out.println(" :Welcome to credit card information :");
                System.out.println("Enter last 4 digit number ");
                 int num= input.nextInt();

                break;
            case 4:
                System.out.println(" :Repeat the menu :");
                break;
            default:
                System.out.println(" :wrong Window :");



        }




    }

}
