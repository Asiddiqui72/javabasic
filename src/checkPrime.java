import  java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isprime(num));

    }
    static  boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        int c =2;
        while (c*c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        if(c*c == 0){
            return true;
        }
        return false;

    }
}
