package july8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter  number: ");
        int x = num1.nextInt();


        if (x == 1) {

            System.out.println("Enter the 1st number: ");
            int y = num1.nextInt();
            System.out.println("Enter the 2nd number: ");
            int z = num1.nextInt();
            int add = y + z;

            System.out.println("addition : " +add);
        }
        else if (x == 2){
            System.out.println("Enter the 2nd number: ");
        int y = num1.nextInt();
        System.out.println("Enter the 3nd number: ");
        int z = num1.nextInt();
        int sub = y - z;
        System.out.println("substractions : " + sub);

    }
        else if (x == 3) {
            System.out.println("Enter the 2nd number: ");
            int y = num1.nextInt();
            System.out.println("Enter the 3nd number: ");
            int z = num1.nextInt();
            int mul = y * z;
            System.out.println("multiplication: " + mul);
        }
        else if (x == 4){
            System.out.println("Enter the 2nd number: ");
            int y = num1.nextInt();
            System.out.println("Enter the 3nd number: ");
            int z = num1.nextInt();
            int div = y/z;
            System.out.println("division : " + div);

        }
        else
            System.out.println("wrong input !");


    }



    }




