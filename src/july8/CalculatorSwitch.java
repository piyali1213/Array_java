
        package july8;
import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your input: ");
       int input = sc .nextInt();
      /* Scanner num1 = new Scanner(System.in);
      int x = num1.nextInt();
        int y;
        int z;*/

        System.out.println("Calculator ");
        System.out.println("1 : addition ");
        System.out.println("2 : Subtractions ");
        System.out.println(" 3 : multiplication ");
        System.out.println(" 4: division");


       // int input = sc.nextInt();
        switch (input) {
            case 1:
                int x = sc.nextInt();
                System.out.println("Enter the 1st number: ");
                int  y = sc .nextInt();
                System.out.println("Enter the 2nd number: ");
                 int z = sc.nextInt();
                int add = y + z;

                System.out.println("addition : " + add);
                break;
            case 2:
                System.out.println("Enter the 1st number: ");
                y = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                z = sc.nextInt();
                int sub = y - z;

                System.out.println("subtraction : " + sub);
                break;
            case 3:
                System.out.println("Enter the 1st number: ");
                y = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                 z = sc.nextInt();
                int mul= y * z;

                System.out.println("subtraction : " + mul);
                break;
            case 4:

                System.out.println("Enter the 1st number: ");
                y = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                z = sc.nextInt();
                int div= y/z;

                System.out.println("division : " + div);
                break;
            default:
                    System.out.println("wrong input ");

        }


    }
}