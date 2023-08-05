package StringAssignment;

public class StringReverse {
    public static void main(String[] args) {
        String srt = new String("Pragra");
        char arr[]=srt.toCharArray();// converting string to char array.

        System.out.println(arr);

        System.out.println("The Revers string array is bellow :");

        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }


    }
}
