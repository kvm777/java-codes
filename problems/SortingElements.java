package problems;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {
    public static void main(String[] args) {

        //Approach1 : 
        int a[] = {30,50,10,60,20};
        System.out.println("before sorting method1 " +Arrays.toString(a));

        Arrays.parallelSort(a);
        System.out.println("after sorting method1 " +Arrays.toString(a));
        
        System.out.println();

        //approach2:
        int b[] = {300,500,100,600,200};
        System.out.println("before sorting method2 " +Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("after sorting method2 " +Arrays.toString(b));
    
        System.out.println();

        //approach3 : reverse order
        Integer c[] = {30,50,100,60,20};
        System.out.println("before reverse sorting method3 " +Arrays.toString(c));
        Arrays.sort(c,Collections.reverseOrder());
        System.out.println("after reverse sorting method3 " +Arrays.toString(c));

    }
}
