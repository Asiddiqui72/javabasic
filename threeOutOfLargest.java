import  java.util.Scanner;
import java.util.Set;

public class threeOutOfLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter the third largest number");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(" the num1 is greater the other two number :" +  num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("the num2 is greater the other two number: " + num2 );

        }
        else {
            System.out.println(num3);
        }
        System.out.println("_______________________________________________");
        int max = Math.max(num3 , Math.max(num1 , num2));
        System.out.println(max);
    }
}
