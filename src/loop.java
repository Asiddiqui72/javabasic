public class loop {
    public static void main(String[] args) {
        /*
        systax of for loop
        for(initialisation; condition; increment/decrement)
         */
        for(int i=0; i<20; i= i+2){
            System.out.println(i);
        }
        /*
        while
        systax
            while (condition) {
        //body
        }
         */
        int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }

        /*
        systax
        do{
        statemente
        }
        while(condition);
         */
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i!=1);

    }
}