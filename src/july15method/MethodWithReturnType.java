package july15method;
class ReturnAdd{
public static int add(int num1,int num2){
    System.out.println("addition is " + (num1+num2));
    return num1+num2;
}

}
public class MethodWithReturnType {
    public static void main(String[] args) {
        ReturnAdd.add(3,5);
    }
}
