import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */
public class Ex5{
    public static void main(String[] args) {
        System.out.println("input two number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        swap(x, y);
        System.out.println(x);
        System.out.println(y);

    }
    private static void swap(int a, int b){
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("after swapping:");
        System.out.println(a +" "+ b);

    }



}
