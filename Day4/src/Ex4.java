import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */
public class Ex4 {

    private static boolean isLeapYear() {
        int year;
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        return year % 4 == 0;
    }
    public static void main(String[] args) {
        if (isLeapYear()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }




}
