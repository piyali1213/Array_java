package assignment;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // String choice;


        System.out.print("Enter the first value : ");
        int fir = input.nextInt();
        System.out.print("Enter the second value : ");
        int sec = input.nextInt();
        System.out.print("Enter the third value : ");
        int thi = input.nextInt();

        if (fir > sec && fir > thi) {
            System.out.println(+fir + " first number is the greatest no .");
        } else if (sec > fir && sec > thi) {
            System.out.println(+sec + " second number is the greatest no .");
        } else if (thi > fir && thi > sec) {
            System.out.println(+thi + " third number is the greatest no .");
        } else if (fir == sec && sec == thi) {
            System.out.println("all are equal number");
        } else {
            System.out.println("invalid");
        }
    }
}
   /* System.out.println("do you want to exit ? \n press y for continue or n for exit");
    choice = input.next();
    {
        while (true) {
            if (choice != "yes") {
                System.out.println("continue");
            } else {
                System.out.println("exit");

            }*/






