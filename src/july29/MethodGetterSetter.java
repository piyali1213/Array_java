package july29;

public class MethodGetterSetter {
    private  String name;
    private int age;
    private String username;
    private String password = "acbder";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

   /* @Override
    public String toString() {
        return "MethodGetterSetter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }*/

    public static void main(String[] args) {
        MethodGetterSetter student= new MethodGetterSetter();
        student.setName("piyali");
        student.setAge(30);
        student.setUsername("abch@gmail");
        //System.out.println(student);
        System.out.println("Name of the student: " +student.getName());
        System.out.println("age of the student: " +student.getAge());
        System.out.println("username: "+student.getUsername());
        System.out.println("password: "+student.getPassword());
    }

    }