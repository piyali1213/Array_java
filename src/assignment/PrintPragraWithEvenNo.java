package assignment;

import java.sql.SQLOutput;

public class PrintPragraWithEvenNo {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.println(" Pragra");
            }
            else {
                System.out.println(i);
            }


        }
    }}
