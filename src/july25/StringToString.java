package july25;

public class StringToString {
    String name;
    int roll_no;
    int age;

    @Override
    public String toString() {
        return "StringToString{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {           //overridden method

        StringToString students= new StringToString();
        students.name="piyali";
        students.age=20;
        students.roll_no=101;
        System.out.println(students);




    }

}
