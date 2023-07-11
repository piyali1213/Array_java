package assignment;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Multiplication table of given number :");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int digit = input.nextInt();

        int num ;
        for(num=1;num <= 10;num++)
        {


            int mul = digit * num;
            System.out.println(mul);

        }
    }
}
