package july29;

public class ParametarisedConstructorExample {
    int id;
    String name;
   static String course = "Btech"; // course declared as static bcos its same for each.
   static int fees =20000;

    public ParametarisedConstructorExample(int i, String n) { // created parametarised constructor passing values when object created
        id = i;
        name = n;
       // course = c;
       // fees = f;
    }

    public void getStudent() {
        System.out.println(id + " " + name + " " + course + " " + fees);
    }


    public static void main(String[] args) {
        ParametarisedConstructorExample s1 = new ParametarisedConstructorExample(101, "Piyali");  //create objects passing value of objects
        ParametarisedConstructorExample s2 = new ParametarisedConstructorExample(102, "Arghya");
        ParametarisedConstructorExample s3 = new ParametarisedConstructorExample(104, "Priarghya");

        s1.getStudent(); // called method
        s2.getStudent();
        s3.getStudent();


    }
}