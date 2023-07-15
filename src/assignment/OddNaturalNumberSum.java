package assignment;
import java.util.Scanner;

public class OddNaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print(" Enter the term : ");
         int term = input.nextInt();
        int n = 1;
        int sum = 0;
        int num;
        while (n <= term) {
            System.out.println("enter the number : ");
            num = input.nextInt();

            n++;
            if (num % 2 != 0) {
                sum = sum + num;
                System.out.println("Sum of odd numbers = " + sum);
            }


        }

    }
}

