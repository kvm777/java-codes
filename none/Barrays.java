package none;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Barrays {
    public static void main(String[] args) {
    int arr[] =  new int[5];
    int x=1;
    for (int i=0;i<arr.length;i++){
        arr[i]=x++;
        System.out.print(arr[i]+" ");
    }

    System.out.println();

    System.out.println(Arrays.toString(arr));

    List <Integer> l = new ArrayList<>();
    System.out.println(l);
    l.add(1);
    l.add(2);
    l.add(5);
    System.out.println(l);
    
    for(int i=0;i<l.size();i++){
        System.out.print(l.get(i)+" ");
    }
    System.out.println();

    List l2 = new ArrayList<>();
    l2.add(5);
    l2.add("mahesh");
    l2.add(5.00);
    System.out.println(l2);
    
    }
}
