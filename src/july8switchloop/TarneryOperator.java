package july8switchloop;

import java.util.Scanner;

public class TarneryOperator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println ("Enter the Number :" );
        int input = number.nextInt();
       String  result=  (input %2 == 0 ) ? "even": "odd";
        System.out.println (result);

       // int integerresult = (input%2==0)? 1: 0;
        //System.out.println (integerresult);


    }

}
