package july15method;

class MulParameter{
    public static void student(String name, String last_name, int age){
        System.out.println(name+ last_name+ age);
    }
}

public class MultipleParameters {
    public static void main(String[] args) {


        MulParameter.student("piyali", " Saha ",30);
        MulParameter.student("Arghay", " Saha ",34);
        MulParameter.student("Priarghya", " saha ",10);
    }
}
