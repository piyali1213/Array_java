package july22ArrayAndArrayAssignment;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        // int num[]= {10,20,30,40,50,60};

        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);



        // String room[]=new String[5];
        // String room[] = { "bed", "sofa", "bench","floor",  };
        for (int i = 0; i < num.length; i++) {
            System.out.println(" enter the elements ");
            num[i] = sc.nextInt();


        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
}
