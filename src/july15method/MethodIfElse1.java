package july15method;
public class MethodIfElse1
{
    public static void Licence(int age)
    {if(age<18){
        System.out.println("You are not eligible for Driving.");
    }
    else
    {
        System.out.println(" you are eligible for driving. ");
    }
}

    public static void main(String[] args) {
        Licence(15);
    }
}
