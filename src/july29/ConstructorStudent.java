package july29;
class Student {
    private String name;
   private int roll_no;
   private String course;
   private int fees;

    public Student(String name, int roll_no, String course) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
    }

    public Student(String name, int roll_no, String course, int fees) {
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", course='" + course + '\'' +
                ", fees=" + fees +
                '}';
    }
}

public class ConstructorStudent {
    public static void main(String[] args) {
        Student student= new Student("piyali",123,"computer sc");
        Student student1=new Student("arghya ",124,"electrical",20000);
        System.out.println(student);
        System.out.println(student1);
    }
}
