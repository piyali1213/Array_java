package assignment;
import java.util.Scanner;

public class OddNaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the term : ");
        int n = input.nextInt();

        int sum = 0;
        while (n <= 5)

        {
            System.out.println("enter the number : ");
            int num = input.nextInt();
              if (num%2!=0)
              {
                sum = sum + num;
                System.out.println("Sum = " + sum);
              }
            n++;


        }

    }
}
