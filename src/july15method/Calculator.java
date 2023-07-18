package july15method;

import java.util.Scanner;

public class Calculator{
        public static void cal() {
            String user_input = "null";
            do {
                System.out.println("   WELCOME TO MY CALCULATOR   ");
                System.out.println("   ENTER '+' OPERATOR FOR ADDITION  ");
                System.out.println("   ENTER '-' OPERATOR FOR SUBTRACTIONS  ");
                System.out.println("   ENTER '*' OPERATOR FOR MULTIPLICATIONS  ");
                System.out.println("   ENTER '/' OPERATOR FOR DIVISION  ");
                Scanner input = new Scanner(System.in);
                System.out.println(" Enter the Input : ");
                char choice = input.next().charAt(0);
                System.out.print(" Enter 1st number  : ");
                int num1 = input.nextInt();
                System.out.print(" Enter 2nd number  : ");
                int num2 = input.nextInt();
                System.out.print(" Enter 3rd number  : ");
                int num3 = input.nextInt();


                switch (choice) {
                    case '+':
                        Calculator.add(num1, num2, num3);

                        break;
                    case '-':
                        Calculator.subs(num1, num2);
                        break;

                    case '*':
                        Calculator.muls(num1, num2);

                        break;

                    case '/':
                        Calculator.divs(num1, num2);

                        break;
                    default:
                        System.out.println("WRONG WINDOW");

                }

                System.out.println(" IF YOU WANT TO CONTINUE PRESS 'Y' OR FOR EXIT PRESS 'N' ");
                    user_input = input.next();
                }
                while (user_input.equals("y") || user_input.equals("N")) ;
            }

        public static void add ( int n1, int n2)
        {
            int sum = n1 + n2;
            System.out.println("the sum of two number " + sum);
        }
        public static void add(int n1,int n2, int n3){
            int sum= n1+n2+n3;
            System.out.println("the sum of two number " + sum);
        }
        public static void subs ( int n1, int n2)
        {
            int sub = n1 - n2;
            System.out.println("the subtractions of two number " + sub);
        }
    public static void subs ( int n1, int n2 , int n3)
    {
        int sub = n1 - n2 -n3;
        System.out.println("the subtractions of two number " + sub);
    }
        public static void muls ( int n1, int n2)
        {
            int mul = n1 * n2;
            System.out.println("the multiplications of two number " + mul);
        }
    public static void muls ( int n1, int n2 , int n3)
    {
        int mul = n1 * n2*n3;
        System.out.println("the multiplications of two number " + mul);
    }
        public static void divs ( int n1,int n2)
        {
            int div = n1 / n2;
            System.out.println("the divisions of two number " + div);
        }



    }

