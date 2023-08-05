package StringAssignment;

public class FindStringElement {
    public static void main(String[] args) {
      /*  String srt = new String("Niagara");
        System.out.println(srt.charAt(0));*/

        String srt = new String("Niagara");
        char arr[] = srt.toCharArray();  // converted string to char array.
        char element = 'g';   // find the element g
        System.out.println("index no and element given bellow :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(i);
                System.out.println(arr[i]);


            }


        }
    }
}
