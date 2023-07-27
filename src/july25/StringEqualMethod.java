package july25;

public class StringEqualMethod {
    public static void main(String[] args) {
        String s1= "Niagara";
        String s2= "Niagara";
        String s3= "Niagara";
        String s4= new String("Niagara");
        System.out.println(s1==s2); //true because memory address which is same

        System.out.println(s1==s4); // false ...because jvm would check both contain and memory address here the memory address is different
        System.out.println(s1.equals(s2)); //true... check contain
        System.out.println(s1.equals(s4));  // true ... equal method only check memory contain.
    }
}
