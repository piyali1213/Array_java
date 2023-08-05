package july22ArrayAndArrayAssignment;

public class ArrayMinNo {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 5, 1, 88, 3};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

        }
        System.out.println(" The array is given bellow :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
            System.out.print(" The minimum number of the array is : " +min);


        }
    }

