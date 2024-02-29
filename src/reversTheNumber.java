import  java.util.Scanner;
public class reversTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans =0;
        while(num>0){

            ans = ans *10;
            int rem = num%10;
            ans = ans+rem;
            num = num/10;

        }
        System.out.println(ans);


    }
}
