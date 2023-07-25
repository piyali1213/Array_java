package array;

public class ArrayMinNo {
    public static void main(String[] args) {
        int a[] = new int []{23,4,56,3,2,6};
       // int a[] ={23,4,7,8,1,5};
        int min = a[0];
        for(int i= 0; i<a.length; i++) {

            if (min > a[i])
                min = a[i];
        }
        System.out.println(" the minimum number in the array : " +min);

    }
}
