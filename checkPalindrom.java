import  java.util.*;
public class checkPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();


        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        if(s.equals(reversed)){
            System.out.println("palindrom");
        }
        else {
            System.out.println("not");
        }

        String z = "Madam";
        z = z.toLowerCase();
      //  int arr [] = new int[];
        for( int i=0; i<=z.length()/2;  i++){
            char start = z.charAt(i);
            char enf = z.charAt(z.length()-1 -i);
            if(start != enf){
                System.out.println("not");
            }
            else {
                System.out.println("true");
            }
        }
    }
}
