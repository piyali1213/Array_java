package assignment;
import java.util.Scanner;
public class CubeNumber {
    public static void main(String[] args) {


        System.out.println("//display the cube of a given number//");
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter the Digit :");
       // int digit = input.nextInt();

        System.out.println("Enter the Term:");
        int term =input.nextInt();
        for (int num = 1; num <=term ; num++) {
            int cube = num*num*num;
            System.out.println( cube);
        }
    }
}