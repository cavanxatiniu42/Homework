import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by Thu Thuy Nguyen on 6/25/2016.
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number of element in your array: ");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("input your array");

        for (int i = 0; i<len; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("input the order of element want to change: ");
        int a = sc.nextInt();
        System.out.println("input the change: ");
        int c = sc.nextInt();
        for (int i = 0; i<len; i++) {
            if (a == i) {
                array[i] = c;

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Input the order want to delete: ");
        int b = sc.nextInt();

//        for (int i = 0; i<len; i++) {
//            if (b == i) {
//                System.arraycopy(array, i + 1, array, i, len - i -1);
//                len--;
//            }
//        }
        System.out.println(Arrays.toString(array));
    }
}
