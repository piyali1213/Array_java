package july4scanner;
import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args)

    {
        Scanner num =new Scanner(System.in);
        System.out.print("Enter the day of the week : ");
        int day = num.nextInt();
        if (day == 1) {
            System.out.println("today is Monday");
        } else if (day == 2) {
            System.out.println("today is Tuesday ");
        } else if (day == 3) {
            System.out.println("today is Wednesday");
        } else if (day == 4) {
            System.out.println("today is Thursday");
        } else if (day == 5) {
            System.out.println("today is Friday");
        } else if (day == 6) {
            System.out.println("today is Saturday");
        } else if (day == 7) {
            System.out.println("today is Sunday");
        } else {
            System.out.println("invalid");
        }
    }
}








