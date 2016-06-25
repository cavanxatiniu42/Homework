/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Input the length of your array: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("Input your array:");
        for (int i= 0; i<len;i++){
            Scanner sc2 =new Scanner(System.in);
            array[i] = sc2.nextInt();

        }
        int largest = array[0];
        int smallest = array[0];
        int a = 0,b = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i<len ;i++) {
            if (array[i] > largest) {
                largest = array[i];
                a = i;
            }
        }
        for (int i = 0; i<len ;i++){
            if (array[i]<smallest){
                smallest = array[i];
                 b = i;
            }
        }
        System.out.println("The largest number: " + largest + " index: " + a);
        System.out.println("The smallest number: " + smallest +" index: "+ b);


        }

    }
