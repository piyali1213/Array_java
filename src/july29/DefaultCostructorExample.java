package july29;



class Student1{
    String name;
    int id;
    public void getStudent()   // cant pass value otherwise you have to pave value when call method
    {
        System.out.println(name+ " and " +id);
    }
}
public class DefaultCostructorExample {         // here we didnt create constructor compiler created a default which passed the value of objects
    public static void main(String[] args) {
        Student1 s1 = new Student1();  // create objects
        Student1 s2 = new Student1();
        s1.getStudent();   // calling methods
        s2.getStudent();

    }
}
