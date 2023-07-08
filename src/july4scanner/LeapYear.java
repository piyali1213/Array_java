package july4scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int x = num1.nextInt();
        if (x % 4 == 0) {
            System.out.println("The year is LeapYear : " + x);
        } else {
            System.out.println("The year is not LeapYear : " + x);
        }
    }

}



