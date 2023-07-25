package array;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println(" enter the elements of array");
            arr[i] = input.nextInt();
        }
       // input.close();
        System.out.println("the array is given : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
