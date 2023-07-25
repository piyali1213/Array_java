package array;

public class ArrayAnonymous {

    static void anonymous(int a[])
    {
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public static void main(String[] args) {
        anonymous(new int[]{ 33,66,11,55,44});

    }
}
