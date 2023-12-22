package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//return he intersection of elements in 2 arrays...

public class Intersection {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,7,4,6,9};
        PrintIntersection(a, b);
    }
    public static void PrintIntersection(int[] arr1,int[] arr2){
        HashSet <Integer> hs=new HashSet<>();
        //int l[] = new int[arr1.length];
        //using to string method..
        String s1="";
        
        //using list method
        List <Integer> l1=new ArrayList<>();
        System.out.println(l1);
        for(int i:arr1){
            hs.add(i);
        }
        int k=0;
        for(int j:arr2){
            if(hs.contains(j)){
                //l[k]=j;
                l1.add(j);
                s1+=j+"";
                k++;
            }
        }
        String l2[]=s1.split("");
        //System.out.println(Arrays.toString(l));
        for(int x:l1){
            System.out.println(x);
        }
        System.out.println(l1);
        
        
        System.out.println(Arrays.toString(l2));
    }
}
