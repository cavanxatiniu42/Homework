/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter an interger: ");
        Scanner sc = new Scanner(System.in);
        int x = 1;// = sc.nextInt();
        int count = 0;
        int s = 0;

        while(x!= 0){
            x = sc.nextInt();
          //  System.out.println(x);
            s = s+ x;
            count++;
        }
        System.out.println("sum = " +s);
        System.out.println("average = " + (s/count));
//        int array[] = new int[count];
//
//        for (int i =0; i<count; i++){
//            array[i] = sc.nextInt();
//            }


    }
}
