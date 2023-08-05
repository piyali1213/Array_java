package constructorAssignment;

public class CalculatorConstructor {
    private  double num1;
    private double num2;  //Declared instance variable


    public double addition(){
        System.out.println  ("addition:" +(num1+num2)); //  addition method
        return num1+num2;}
        public double subtract (){
        System.out.println("subtraction :" +(num1-num2)); //  subtract method
        return num1+num2;}
       public double multiplication(){
        System.out.println("multiplications: "+(num1*num2)); //  multiplication method
        return num1*num2;}
    public double division(){
        System.out.println("division :" +(num1/num2));  //  division method
        return num1/num2;}

    public CalculatorConstructor(double num1, double num2) {   //  parameterised constructor
        this.num1 = num1;     // this keyword differentiate instance variable and local variable.
        this.num2 = num2;}

    public static void main(String[] args) {

      CalculatorConstructor obj = new CalculatorConstructor(23.45,14.45); // initialised object with new keyword by calling constructor and passing values
        obj.addition();      //called methods
        obj.subtract();
        obj.multiplication();
       obj.division();
}
}
