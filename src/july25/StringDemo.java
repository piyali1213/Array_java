package july25;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "pragra";
         String s2= "piyali";
           String s3 = "pragra";
        int num=10;
        System.out.println( num + num +s1 + num +num ); // 20piyali become string when int concatinate with string

                                                        //  after s1 num is not adding print whole line string
        String s= String.valueOf(num);
        System.out.println(10 + s); // it would not add , it print the whole string
    }
}