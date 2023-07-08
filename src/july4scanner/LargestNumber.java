package july4scanner;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
     Scanner num1 = new Scanner(System.in);
     System.out.println("Enter the 1st number: ");
     int x = num1.nextInt();
        System.out.println("Enter the 2nd number: ");
        int y = num1.nextInt();
        System.out.println("Enter the 3rd number: ");
        int z = num1.nextInt();
        if (x>y && x>z) {
            System.out.println("the 1st number is the largest number : " +x);
        }
        else if (y>x && y>z) {

            System.out.println("the 2nd number is the largest number : " +y);
        }
        else
            {
            System.out.println("the 3rd number is the largest number : " +z);
        }
    }
}
