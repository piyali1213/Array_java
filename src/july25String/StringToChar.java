package july25String;

public class StringToChar {
    public static void main(String[] args) {
        String srt = new String("Piyali");
        char arr[] = srt.toCharArray();
        System.out.println(" String to Array :");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }
}