import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */
public class Ex4 {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        isLeapYear(year);
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
