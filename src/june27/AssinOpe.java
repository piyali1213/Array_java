package june27;

public class AssinOpe {
    public static void main(String[] args) {

        int x= 10;
        int y= 20;
        int z = 30;
        boolean result = (x<y && x<z);

        //System.out.println (result);
        System.out.println("result: " +result);
        System.out.println( x>y && x<z);
        System.out.println( x>y || x<z);
        System.out.println( y>x || y>z);
        System.out.println( x>y || x>z);


    }
}
