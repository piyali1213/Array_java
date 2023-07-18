package july15method;

import java.util.Scanner;

public class Calculator2 {
    public static void cal2() {
       // String user_input = "null";

            System.out.println("   WELCOME TO MY CALCULATOR   ");
            System.out.println("   ENTER '+' OPERATOR FOR ADDITION  ");
            System.out.println("   ENTER '-' OPERATOR FOR SUBTRACTIONS  ");
            System.out.println("   ENTER '*' OPERATOR FOR MULTIPLICATIONS  ");
            System.out.println("   ENTER '/' OPERATOR FOR DIVISION  ");
            Scanner input = new Scanner(System.in);
            System.out.println(" Enter the Input : ");
            char choice = input.next().charAt(0);



            switch (choice) {
                case '+':
                    Calculator2.add2();

                    break;
                case '-':
                    Calculator2.subs2();
                    break;

                case '*':
                    Calculator2.muls2();

                    break;

                case '/':
                    Calculator2.divs2();

                    break;
                default:
                    System.out.println("WRONG WINDOW");

            }


    }

    public static void add2(){
        Scanner input = new Scanner(System.in);

            System.out.print(" Enter 1st number  : ");
             int num1 = input.nextInt();
            System.out.print(" Enter 2nd number  : ");
            int num2 = input.nextInt();

            int sum = num1 + num2;

            System.out.println("the sum of two number " + sum);
        }


    public static void subs2 ()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter 1st number  : ");
         int num1 = input.nextInt();
        System.out.print(" Enter 2nd number  : ");
        int num2 = input.nextInt();

        int sub = num1 - num2;
        System.out.println("the subtractions of two number " + sub);
    }

    public static void muls2 ()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter 1st number  : ");
        int num1 = input.nextInt();
        System.out.print(" Enter 2nd number  : ");
       int num2 = input.nextInt();
        int mul = num1*num2;
        System.out.println("the multiplications of two number " + mul);
    }

    public static void divs2 ()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter 1st number  : ");
        int num1 = input.nextInt();
        System.out.print(" Enter 2nd number  : ");
        int num2 = input.nextInt();
        int div = num1 / num2;
        System.out.println("the divisions of two number " + div);
    }



}



