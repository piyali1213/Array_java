package array;

public class Array2DNaturalNo {
    public static void main(String[] args) {
        int num[][] = new int[3][3];

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = count++;
                System.out.print(num[i][j] + " ");
            }
            System.out.println();


                                                              /*  for (int i = 0; i < num.length; i++) {

                                                              for (int j = 0; j < num[i].length; j++) {*/
        }
    }
}
