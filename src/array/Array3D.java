package array;

public class Array3D {
    public static void main(String[] args) {

        int num[][][] = new int[3][3][3];

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {
                    // System.out.println(num[i][j][k]+ " ");
                    num[i][j][k] = count++;
                    System.out.print(num[i][j][k] + " ");

                }
            }
            System.out.println();
        }
                }
            }


      /*  for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                for (int k = 0; k < num[i][j].length; k++) {

        }
    }*/