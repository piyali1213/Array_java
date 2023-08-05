package july22ArrayAndArrayAssignment;

public class ArrayBigNo {
    public static void main(String[] args) {
        int arr[] = new int[]{34, 56, 12, 555, 78, 99};
        int big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (big < arr[i])
                big = arr[i];
        }
        System.out.println(" The array is given bellow : ");
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println("The biggest no in the array : " + big);
    }
}
