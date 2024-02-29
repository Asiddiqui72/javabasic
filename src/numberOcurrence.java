import  java.util.Scanner;
public class numberOcurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int num1 = 7;
        int coun=0;
        while(num>0){
            int rem = num%10;
            if( rem == 7){
                coun++;
            }
            num = num/10;
        }
        System.out.println("the count of the number is : " +  coun);


    }

}
