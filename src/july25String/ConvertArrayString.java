package july25String;

public class ConvertArrayString {
    public static void main(String[] args) {
        // string to array

      /*  String s1 = "Niagara";
        char chars[] = s1.toCharArray();
        System.out.println("string to array :");
        for (char ch : chars) {
            System.out.print( " "+ch);


        }
    }
}*/
              // Array to String

        char ch[]={'n','i','a','g','a','r','a'};
        String s1= new String(ch);
        System.out.println("Array to string : ");
        System.out.println(s1);


    }
}
