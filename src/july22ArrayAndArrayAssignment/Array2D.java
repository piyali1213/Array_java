package july22ArrayAndArrayAssignment;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        //  int arr[][]= new int[3][3];
        // int arr[][] = {{2, 3, 4}, {4, 4, 6}, {0, 7, 8}};
        // int matrix[][]=new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the elements ");
        int matrix[][] = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

    }
}
