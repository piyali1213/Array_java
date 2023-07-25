package array;

import java.util.Scanner;

public class ArrayUserInput2D {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        System.out.println("Enter the size of the array");
        int size1 = input.nextInt();
        int arr[][] = new int[size][size1];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                System.out.println(" enter the elements of array row");
                arr[i][j] = input.nextInt();
                {
                    System.out.println(" enter the elements of array coloum");
                    arr[i][j] = input.nextInt();
                }
            }
            // input.close();
            System.out.println("the array is given : ");
            for (i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; i++) {
                    System.out.println(arr[i][j] + " ");

                }
                System.out.println();

            }
        }

    }
}
