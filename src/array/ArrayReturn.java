package array;

public class ArrayReturn {
    static int[] arrReturn()
    {
        return new int[] {23,45,67,89};
    }

    public static void main(String[] args) {
     int a[]= arrReturn();

        for(int i=0; i< a.length;i++)
            System.out.println(a[i]);
    }
}
