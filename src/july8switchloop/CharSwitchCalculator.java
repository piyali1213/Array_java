package july8switchloop;

import java.util.Scanner;

public class CharSwitchCalculator {
    public static void main(String[] args) {


        System.out.println("+: addition");
        System.out.println("-: subtraction");
        System.out.println("*: multiplication");
        System.out.println("/: division");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your input : ");
        // int input = sc.nextInt();
        char input = sc.next().charAt(0);

        switch (input)

        {
            case '+':
                public static int sum(int num1,int num2){ sum= num1+num2};

               /* System.out.println("Enter the 1st number: ");
                int num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                int num2 = sc.nextInt();
                int sum = num1 + num2;
                System.out.println("the addition :" +sum);*/
                break;
            case '-':

                public static int sub(int num1,int num2){ sub= num1-num2};

               /* System.out.println("Enter the 1st number: ");
                num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = sc.nextInt();
                int sub = num1 - num2;
                System.out.println("the subtraction :" +sub);*/
                break;
            case '*' :
                public static int mul(int num1,int num2){ mul= num1*num2};
              /*  System.out.println("Enter the 1st number: ");
                num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = sc.nextInt();
                int mul = num1 * num2;
                System.out.println("the addition :" + mul);*/

                break;
            case '/':
                public static int div(int num1,int num2){ div= num1/num2};
                /*System.out.println("Enter the 1st number: ");
                num1 = sc.nextInt();
                System.out.println("Enter the 2nd number: ");
                num2 = sc.nextInt();
                int div = num1/num2;
                System.out.println("the division : " + div);
                break;*/
            default:
                System.out.println("Wrong Window ");
        }
    }
}
