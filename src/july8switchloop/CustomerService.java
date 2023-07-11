package july8switchloop;
import java.util.Scanner;
public class CustomerService {
    public static void main(String[] args) {

        System.out.println(": welcome to Td customer service:");
        System.out.println("Enter The following options :");
        System.out.println("1:press 1 to enter you access no :");
        System.out.println("2:press 2 if you look around:");
        System.out.println("3:press 3 if you don't have access no :");
        System.out.println("4:press 4 go to the main menu :");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your options :");
        int options = input.nextInt();
        switch (options) {
            case 1:
                System.out.println("Enter last 4 digit number :");
                int digit = input.nextInt();
                if (digit >999 && digit<10000) {
                    System.out.println("valid scenario");
                    System.out.println(" press # talk to the agent \n press & account information \n press * current balance ");
                    System.out.println("Enter char : ");
                    char ch = input.next().charAt(0);

                    switch (ch) {
                        case '#':
                            System.out.println("talk to the agent");
                            break;
                        case '&':
                            System.out.println("Account information");
                            break;
                        case '*':
                            System.out.println("current balance");
                            break;
                        default:
                            System.out.println("go to the main menu:");
                    }
                }
                else {
                    System.out.println("not a valid scenario");
                }
                break;


            case 2:

                System.out.println(" press 1 open new account \n press 2 credit card information  \n press 3 book an appointment");
                System.out.println("Enter the number : ");
                int num = input.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("Enter your access code:");
                        break;
                    case 2:
                        System.out.println("credit card information:");
                        break;
                    case 3:
                        System.out.println("book an appointment");
                        break;
                    default:
                        System.out.println("something wrong ");

                }
                break;

            case 3:
                System.out.println("Enter your card number :");
                int cardnum = input.nextInt();
                System.out.println("check you verification code over phone");
                System.out.println("is your verifacation code true :");
               //boolean vernum = input.hasNext();
               String vernum=input.next();
                // vernum = true;

                if (vernum == "true")
                {
                    System.out.println("thanks for calling ");
                }
                else
                {
                    System.out.println("go back to the main menu ");
                }

                break;
            default:
                System.out.println("wrong window ");
        }

    }
}









