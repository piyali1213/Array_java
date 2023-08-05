package july25String;

public class StringMethods {
    public static void main(String[] args) {

        String s1= "Niagara";
        String s2= "Example";
        String s3= new String("school");
        String s4= "Niagara";
        String s5= "    keyboard";
        System.out.println("1. "+s1.charAt(3));
        System.out.println("2. "+s3.charAt(0));
        System.out.println("3. "+s1.equals(s3));
        System.out.println("4. "+s1.equals(s4));
        System.out.println("5. "+s2.concat(s3));
        System.out.println("6. "+s3.replace('s','h'));
        System.out.println("7. "+s1.replace("Ni","Pr"));
        System.out.println("8. "+s4.contains("acbvgh"));
        System.out.println("9. "+s4.contains("Niagara"));
        System.out.println("10. "+s2.contentEquals("Example" ));
        System.out.println("11. "+s3.indexOf('h'));
        System.out.println("12. "+s1.indexOf('N'));
        System.out.println("13. "+s1.isEmpty());
        System.out.println("14. "+s4.toUpperCase());
        System.out.println("15. "+s3.toUpperCase());
        System.out.println("16. "+s1.toLowerCase());
        System.out.println("17. "+s2.length());
        System.out.println("18. "+s3.length());
        System.out.println("19. "+s4.length());
        System.out.println("20. "+s1.lastIndexOf('a'));
        System.out.println("21. "+s2.substring(2));

        System.out.println("22. "+s5.trim());
        System.out.println("23. "+s3.replaceFirst("sc","pp"));
        System.out.println("24. "+s3.substring(0,3));//substring start with 0 index end with 3 index
        System.out.println("25. "+s1.toUpperCase());
        System.out.println("26. "+s2.toLowerCase());


    }
}
