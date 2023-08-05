package july29;
class Date1{

        private int Day;
        private int Month;  // instance variable
        private int Year;
        // public Date() {
        // Default constructor
        //  }
    public Date1(int D,int M,int Y) {
        Day=D;
        Month=M; // local variable
        Year=Y;
    }
        public void getDate()
        {
            System.out.println(Day+" /"+Month+ " /"+Year);
        }
    }
    public class ParameterizedConstructorLms {
    public static void main(String[] args) {
        Date1 s1= new Date1(23,04,1986); // initialised object by calling parameterised constructor
        s1.getDate();

    }
}
