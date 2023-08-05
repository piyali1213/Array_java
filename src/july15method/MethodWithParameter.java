package july15method;


class Parameter{
    public static void name(String last_name)
    { //  last_name="Saha";
        System.out.println(last_name+ " saha");
    }
}
public class MethodWithParameter {
    public static void main(String[] args) {
        Parameter.name("Piyali");
        Parameter.name("Arghya");
        Parameter.name("Priarghya");
    }


}
