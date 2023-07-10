package july8switchloop;

public class WhileLoopNutralNumber {
    public static void main(String[] args) {
        int num1;
        int num2;

        num1 =0;
        num2=1;
        while (num1 < 10) {
            num2 = num1 + num2 ;
            num1++;
            System.out.println("result : " + num2);

        }
    }
}

