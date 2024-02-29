import java.util.Scanner;

public class SwitchPra {
    public static void main(String[] args) {
        /*
        switch case practice
        switch (expression){
        case one:
        do
        case two;
        do
        case three:
        do
        }
         */
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruite");
            case "litch" -> System.out.println("FAMOUS IN BIHAR");
            case "apple" -> System.out.println("major crops of himacha");
        }








    }
}
