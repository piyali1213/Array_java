package july8switchloop;

import java.util.Scanner;

public class CharIFElseCalculator {
    public static void main(String[] args) {

        System.out.println("+: addition");
        System.out.println("-: subtraction");
        System.out.println("*: multiplication");
        System.out.println("/: division");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your input :");
        char ch;
        ch = scanner. next().charAt(0);
        // int input = Scanner.nextInt();

        if (ch == '+') {
            System.out.println("Enter the first number");
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter  number: ");
            int x = num1.nextInt();


            if (ch == '+') {

                System.out.println("Enter the 1st number: ");
                int y = num1.nextInt();
                System.out.println("Enter the 2nd number: ");
                int z = num1.nextInt();
                int add = y + z;

                System.out.println("addition : " + add);
            } else if (ch == '-') {
                System.out.println("Enter the 2nd number: ");
                int y = num1.nextInt();
                System.out.println("Enter the 3nd number: ");
                int z = num1.nextInt();
                int sub = y - z;
                System.out.println("subtractions : " + sub);

            } else if (ch == '*') {
                System.out.println("Enter the 2nd number: ");
                int y = num1.nextInt();
                System.out.println("Enter the 3nd number: ");
                int z = num1.nextInt();
                int mul = y * z;
                System.out.println("multiplication: " + mul);
            } else if (ch == '/') {
                System.out.println("Enter the 2nd number: ");
                int y = num1.nextInt();
                System.out.println("Enter the 3nd number: ");
                int z = num1.nextInt();
                int div = y / z;
                System.out.println("division : " + div);

            } else {
                System.out.println("wrong input !");


            }


        }


    }


}