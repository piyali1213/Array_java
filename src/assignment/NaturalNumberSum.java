package assignment;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        System.out.println("Display of sum of 10 natural numbers : ");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the term :");
        int term= input.nextInt();
        int num1=0;
        System.out.println("Enter the 1st natural number:");
        int num2= input.nextInt();
       // int num2=1;


        while (num1<=term)

        {
            num2=num1+num2;
            System.out.println(num2);
            num1++;
        }



    }
}
