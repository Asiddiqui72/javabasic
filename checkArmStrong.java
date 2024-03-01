import  java.util.Scanner;
public class checkArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check(num));
    }
    static  boolean check(int num){
        int ori = num;
        int sum =0;
        while(num >0){
            int rem = num%10;
            num = num/10;
            sum = sum+  rem*rem*rem;

        }
        if(ori == sum){
            return true;
        }
        return false;
    }
}
