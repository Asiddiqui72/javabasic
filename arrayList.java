import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

        // add
        list.add(67);
        list.add(23);
        list.add(56);
        list.add(45);
        System.out.println(list);
        System.out.println(list.contains(67));
        list.set(0 , 45);
        System.out.println(list);
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        for(int i=0; i<3; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.size());

    }
}
