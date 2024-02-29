import  java.util.Scanner;
public class sumFunction {
    public static void main(String[] args) {
        // function calling
        sum();
        int ans = sum2();
        System.out.println(ans);
        int ans2 = sum3(40 , 50);
        System.out.println(ans2);
    }
    /*
    return type (argument){
           //body
           return statement;
           }
     */

   static void  sum(){

       Scanner sc = new Scanner(System.in);
       System.out.println("enter the first number");
       int num1 = sc.nextInt();
       System.out.println("enter the second number");
       int num2 = sc.nextInt();
       int sum = num1+num2;
       System.out.println(" the num of the num is " + sum);
   }

    static int  sum2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return  sum;
    }


    // pass the value of the number when you are  calling the method in main()
    static  int sum3( int a , int b){
       int num = a+b;
       return  num;
    }

}
