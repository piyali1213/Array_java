package july8;
import java.util.Scanner;
public class SwitchJuly8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");

        System.out.println("welcome to my house");
                System.out.println("1 : white blub ");
        System.out.println("2 : blue blub ");
        System.out.println(" 3 : red blub ");
        System.out.println(" 4: nothing ");

        int input = sc .nextInt();
        //String name = Scanner.next();
        //String s
        //enum

        switch(input)
        {
            case 1 :
                System.out.println(" switch on the white blub");
                break;
            case 2 :
                System.out.println("Switch on the red blub");
                break;
            case 3 :
                System.out.println(" switch on the blue blub");
                break;
            case 4 :
                System.out.println("Switch on nothing ....");
                break;
            default :
                System.out.println("wrong input");
        }


    }
}
