import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/26/2016.
 */
public class EX4 {
    public static void main(String[] args) {
        System.out.println("Input array length: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Input your array: ");
        for (int i=0; i<n; i++){
            Scanner sc1 = new Scanner(System.in);
            array[i] = sc1.nextInt();
        }
        System.out.println(isSorted(array));
    }
    private static boolean isSorted(int[] array){

        boolean a = false;
        for (int i = 0; i<array.length; i++) {
            a = array[i] < array[i + 1];
        }
       return a;
    }
}
