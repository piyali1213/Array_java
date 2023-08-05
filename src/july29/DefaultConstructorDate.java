package july29;
class DateTest{
    private int day;
    private int month;
    private int year;
    public DateTest()
    { day=19;
        month=12;
        year=2000;

    }

    public DateTest(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public DateTest(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateTest(int year) {
        this.year = year;
    }

    public void printDate()
    {
        System.out.println("date :" +day +"/"+month+"/"+year);
    }

}
public class DefaultConstructorDate {
    public static void main(String[] args) {

        DateTest obj = new DateTest();
        DateTest obj1 = new DateTest(12,9);
        DateTest obj2= new DateTest(12,11,2013);
        DateTest obj3 = new DateTest(2011);

        obj.printDate();
        obj1.printDate();
        obj2.printDate();
        obj3.printDate();

    }
}
