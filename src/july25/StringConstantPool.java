package july25;

public class StringConstantPool {
    public static void main(String[] args) {


        String s1 = "pragra";   // create object in string constant pool
        System.out.println(s1);
       // s1 = "english ";
       // System.out.println(s1);
        String s2= "pragra";     // point to the same string constant pool
        System.out.println(s2);
        String s3= new String("pragra"); //create new object with different memory location
                                                // new keyword never care about contain always create new object in heap.
        System.out.println(s3);
    }
}
