package array;

public class ArrayMethodMinNo {
    static void minArray(int a[]) {

        int min = a[0];
        for (int i = 0; i < a.length; i++)
        if (min > a[i])
            min = a[i];
        System.out.println("the minimun number of the givin array : " +min);
    }

    public static void main(String[] args) {

      int a[]={5,7,8,99,12 ,-900};
       //int a[]=new int[]{4,7,1,33,7,0 ,-4};
                minArray(a);
    }
}
