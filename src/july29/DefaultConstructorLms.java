package july29;
 class Date {
     private int Day;
     private int Month;
     private int Year;
    // public Date() {
                                    // Default constructor
   //  }
     public void getDate()
     {
         System.out.println(Day+" "+Month+ " "+Year);
     }
 }
public class DefaultConstructorLms {
    public static void main(String[] args) {
        Date s1 = new Date();  // called default constructor to create object // inisiatised object with default value
        s1.getDate();
    }
}
