import java.util.Scanner;

/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */
public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in your array: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] array = new String[len];
        System.out.println("Input your element: ");
        for (int i = 0; i<len; i++){
            Scanner sc1 = new Scanner(System.in);
            array[i] = sc1.nextLine();
        }
        reverseArray(array, len);

    }

    private static void reverseArray(String[] array, int len){

        String tmp;
        for (int i = 0, j = len-1; i<=j; i++, j--){
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        for(int i=0;i<len;i++)
        {
            System.out.println(array[i]);
        }
//        System.out.println("The new array is: "+ array[len]);


    }




}
