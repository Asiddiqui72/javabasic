import  java.util.Scanner;
public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci sequence up to " + num + " numbers:");
        System.out.print(a + " " + b + " "); // Printing the first two numbers

        for (int i = 2; i < num; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

    }
}
