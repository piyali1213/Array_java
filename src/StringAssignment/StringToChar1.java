package StringAssignment;

public class StringToChar1 {
    public static void main(String[] args) {
        String srt = new String("Niagara");
        char arr[]= srt.toCharArray();
        System.out.println(" Print the string array :");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}
