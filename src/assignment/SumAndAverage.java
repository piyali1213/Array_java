package assignment;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("Enter 1st number : ");
        //  int num1 = input.nextInt();
        int num = 1;
         int sum =0;

        while (num <= 5) {

            System.out.println("Enter number : ");
            int num2 = input.nextInt();
            num++;

            sum = num2 + sum;


        }
        System.out.println("Sum of five numbers  :" + sum);
        float ave = sum/num;
        System.out.println("Average of five numbers  :" + ave);

    }


    }

