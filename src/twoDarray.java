import  java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr [ ] = new int[n];
//        for(int i=0; i<n; i++ ){
//             arr[i] = sc.nextInt();
//           // System.out.println(arr[z]);
//        }
//
//        for(int z : arr){
//            System.out.println(z);
//        }
        int [] [] arr = new int [3][3];
        System.out.println(arr.length);

        for(int row =0; row < arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }

        }

        for(int row =0; row < arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();

        }

    }
    //
     //int arr1 [] [] = new int[3][3];
//     int [][] arr1 ={
//            {1, 2, 3}, //zero index
//            {4, 5, 6}, // 2nd index
//            {7, 8, 9} // 3rd index
//    };
    // input





}
