package july4scanner;

import java.util.Scanner;

public class NegativePositiveNumber {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = num1.nextInt();
        if (x < 0) {
            System.out.println("The number is negative : " + x);
        } else {
            System.out.println("The number is positive : " + x);
        }
    }
}
