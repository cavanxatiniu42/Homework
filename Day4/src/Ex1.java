/**
 * Created by Thu Thuy Nguyen on 6/24/2016.
 */
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int choice;
        System.out.println("Press 1 to start the test");
        do {
            Scanner sc0 = new Scanner(System.in);
            switch (choice = sc0.nextInt()){
                case 1:
                    System.out.println("Input your weight: ");
                    Scanner sc = new Scanner(System.in);
                    float w = sc.nextFloat();
                    System.out.println("Input your height: ");
                    Scanner sc1 = new Scanner(System.in);
                    float h = sc1.nextFloat();
                    float bmi = w/(h*h);
                    if (bmi < 18.5){
                        System.out.println("you are so thin");
                    } else if (bmi >= 18.5 && bmi < 25){
                        System.out.println("you are fit");
                    } else if (bmi >= 25 && bmi < 30){
                        System.out.println("you are a little bit fat");
                    } else if (bmi > 30){
                        System.out.println("you are so fat");
                    }
                    System.out.println("Do you wanna try more?");
                    System.out.println("press 1 to continue");
                    System.out.println("press 0 to exit");
            }

        } while (choice != 0);
    }
}
