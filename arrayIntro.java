import  java.util.Scanner;
public class arrayIntro {
    public static void main(String[] args) {
        //syntax

        /*
            datatype [] variable = new datatype[size];
            int [] num = new  int [5];
            int [] num = {1,  2, 3, 4};
          */
        //int sum[]; // decleartion of the array . sum is getting defined in the stack  int datatype sum[] variable = new int [5] creating the object in heap memory
          //      sum  = new int[5];  //intialisation actually here object is being created in the  array
        int [] num = {1,  2, 3, 4};
        System.out.println(num[2]);
        System.out.println(num.length);
        //System.out.println(sum[0]);

       for(int i=0; i<num.length; i++){
           System.out.println(num[i]);
       }
       //inhance version of the array *-
       for(int z : num){
           System.out.print(z);
       }


    }
}
