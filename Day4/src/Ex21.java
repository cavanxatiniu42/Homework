/**
 * Created by Thu Thuy Nguyen on 6/25/2016.
 */
public class Ex21 {
    public static void main(String[] args) {
        System.out.println("show the calender");
        // year(2015,12);
        System.out.println(year(2015, 12));
        System.out.println("this year is leap year?");
        System.out.println(year(2016));

    }
    public static String year(int year, int month) {
        String calender = year + ", " + month;
        return calender;
    }
    public static boolean year(int year) {
        return year % 4 == 0;
    }
}
