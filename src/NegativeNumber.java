import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = num1.nextInt();
        if (x % 2 == 0) {
            System.out.println("The number is even : " + x);
        } else {
            System.out.println("The number is odd : " + x);
        }
    }
}
