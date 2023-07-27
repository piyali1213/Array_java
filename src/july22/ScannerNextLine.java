package july22;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num = input.nextInt();
       input.nextLine();
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println(name);

        // next() only print one word or string when space char come it stop printing
        // nextLine () print the whole line or whole string with space
        // if i skip sout(name) the input not allow me to enter the string line and skip the prog
        // to avoid that you use Scanner type one more line input.nextLine()



    }
        }

