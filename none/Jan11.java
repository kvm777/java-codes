package none;

import java.util.ArrayList;
import java.util.List;


public class Jan11 {
    public static void main(String[] args) {
        //int[] arr = new int[10];
        //String x = Arrays.toString(arr);
        //System.out.println(x);

        List <Integer> l = new ArrayList<>();
        System.out.println(l);

        for (int i=1;i<=10;i++){
            if (i%3!=0)
                l.add(i);
        }
        System.out.println(l);

    }
}
