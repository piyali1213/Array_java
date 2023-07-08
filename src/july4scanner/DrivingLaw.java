package july4scanner;
import java.util.Scanner;
public class DrivingLaw {
    public static void main(String[] args) {

        Scanner age=new Scanner(System.in);
    System.out.println("Enter the age of candidate : ");
    int x = age.nextInt();
    if (x<16)
    {
        System.out.println("Candidate not eligible for driving");
    }
    else if(x>=16 && x<=18)
    {
        System.out.println(" Candidate is eligible for lerner exam");

    }
    else{
            System.out.println(" Candidate is eligible for Driving");



}
}
}