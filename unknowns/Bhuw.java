package unknowns;

import java.util.Arrays;
/*
 * 5    -->>size of array..
 * 12 14 30 24 56   -->elements of array..
 * 17               --integer x
 * 5 3 13 7 39
 * 
 * output : 14
 */
import java.util.Scanner;
public class Bhuw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        /* 
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        */
        sc.nextLine(); 
        String[] str = sc.nextLine().split(" ");    //12 14 30 24 56

        int[] arr = new int[str.length];
        int j=0;

        for (String s:str){
            arr[j]=Integer.parseInt(s);
            j++;
        }
        

        int k = sc.nextInt();
        
        System.out.println(Arrays.toString(arr));   //12 14 30 24 56

        int s=Math.abs(k-arr[0]);   //5
        int x=0;
        for (int i:arr){
            int t=Math.abs(k-i);        //14-17
            //System.out.println(t);
            if(t<s){
                s=t;    //s=3
                x=i;    //x=14
            }
        }

        System.out.println(x);
    }
}
