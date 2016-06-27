import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/26/2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Input your number: ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.println(sumOfDigits(a));
    }
    private static int sumOfDigits(long number){
       int sum= 0;
        while(number > 0){
            sum = sum + (int)(number%10);
            number = number/10;
        }
        return sum;
    }
}
