package array;

public class Array2DRandom {
    public static void main(String[] args) {
        int num[][] = new int[3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                //  num[i][j] = (int) (Math.random() * 100);
                num[i][j] = (int) (Math.random() * 10);

                // System.out.print(num[i][j] + " ");

            }
        }


            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
    }




