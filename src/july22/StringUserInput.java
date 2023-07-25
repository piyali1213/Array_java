package july22;

import java.util.Scanner;

public class StringUserInput {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int size = input.nextInt();
        String room[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println(" enter the elements ");
            room[i] = input.next();
        }

       /* for(int i=0; i<room.length;i++){

            System.out.println(room[i] + " ");

        }
        System.out.println();*/

        for (String n : room) {
            System.out.println(n);
        }

    }
}
