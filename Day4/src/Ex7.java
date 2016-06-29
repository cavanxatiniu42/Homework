import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/25/2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] stringArray;
        stringArray = str.toCharArray();
        for (int i = 0,j = stringArray.length-1; i<j; i++,j--){
            if (stringArray[i]==stringArray[j]){
                System.out.println("symmetric");
            } else {
                System.out.println("not symmetric");
            }
        }
    }

}
