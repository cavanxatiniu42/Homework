import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        System.out.println("input your card code: ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if (isValid(a)){
            System.out.println("This code is valid");
        } else {
            System.out.println("This code is invalid");
        }

    }
    private static int getPrefix(long number, int n){
        int a;
        int did=1;
        for (int i = 0; i<n-1;i++){
            did = did *10;
        }

        a  = (int)(number/did);
        return a;
    }
    private static boolean isRightPrefix(long number){
        int count =0;
        do {
            if (number/10>0)
                count++;
        } while (number>=1);
        int b = getPrefix( number, count);
        return (b/10 ==4 || b/10 ==5 || b/10 == 6 || b ==37);
    }
    private static int sumOfDoubleEvenPlace(long number){
        int count =0;
        int sum_even = 0;
        int mod;
        int sum1 =0;
        if (isRightPrefix(number)){
            do {
                if (number/10>0)
                    count++;
            } while (number>=1);
            if (count%2 ==0){
                mod =(int) ((number%10)*2);
               while (number>0){
                   int a = (int)(((number%100)/10)*2);
                   if (a >9){
                       int sum_tmp = 0;
                       while (a > 0){

                           sum_tmp = sum_tmp + (a%10);
                           a = a/10;
                       }
                       sum1 = sum1 + sum_tmp;
                   } else {
                       sum1 = sum1 + a;
                   }
                   number = number/100;
               }
                sum_even = sum1+ mod;
            } else {
                while (number>0){
                    sum_even = sum_even + (int) (((number%100)/10)*2);
                    number = number/100;
                }
            }
        }
        return sum_even;
    }
    private static int sumOfOddPlace(long number){
        int count=0, sum_odd=0, mod, sum1 =0;
        if (isRightPrefix(number)){
            do {
                if (number/10>0) {
                    count++;
                }
            } while (number>=1);
            if (count%2==0){
                while (number>0){
                    sum_odd = sum_odd + (int) ((number%100)/10);
                    number = number/100;
                }
            } else {
                while (number>0){
                    mod =(int) (number%10);
                    while (number>0){
                        sum1 = sum1 + (int)((number%100)/10);
                        number = number/100;
                    }
                    sum_odd = sum1+ mod;
                }
            }
        }
        return sum_odd;
    }
    private static boolean isValid (long number){
        int sum = sumOfDoubleEvenPlace(number)+ sumOfOddPlace(number);
        return (sum%10 == 0);

    }

}
