package july25String;

public class StringConcatenate {
    public static void main(String[] args) {

         // concatenate with StringBuilder class provides append() method :
      /*  StringBuilder s1 = new StringBuilder("Piyali");
        StringBuilder s2 = new StringBuilder("Saha");
        StringBuilder s= s1.append(s2);  //
        System.out.println(s);
        // System.out.println(s.toString());*/

      //concatenate string with String.format() method by format specifier %s
    /*  String s1= "Piyali";
      String s2 = " Saha";
      String s= String.format("%s%s", s1,s2); //format method passing the parameter like objects
        System.out.println(s);*/


        String srt = new String("New Jersey");
        System.out.println(srt.concat(" Edison"));

    }
}
