package july25String;

public class StringImmutable {
    public static void main(String[] args) {
        String s1= "piyali";
        String s2= "niagara";        // s3 will not create any new object it will point to same memory location.
        String s3="piyali";         //s1 piyali will not changed to piyalisaha s1 will create new object with piyalisaha
                                   // both piyali and piyalisaha objects will be in string constant pool with different address.
        s1= s1+"saha";             // so that string is immutable .

        System.out.println(s1);
        System.out.println(s3);
    }
}
