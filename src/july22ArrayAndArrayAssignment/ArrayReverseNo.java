package july22ArrayAndArrayAssignment;

public class ArrayReverseNo {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 1, 7, 3, 0, 6};
        System.out.println("the Array is given bellow :");
        for (int a : arr)
            System.out.println(" " +a);

        System.out.println(" The reverse array : ");
        int rev = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {

            rev = arr[i];

            System.out.print( " "+arr[i]);

        }
    }
}


