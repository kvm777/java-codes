package unknowns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Kmk {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int n= sc.nextInt();
            String[] strN = br.readLine().split(" ");
            int[] nums = new int[strN.length];
            int m = 0;
            for (int j=0;j<nums.length;j++){
                nums[i]=Integer.parseInt(strN[i]);
                if (nums[i]>m){
                    m=nums[i];
                    System.out.println(m);
                }
            }

            int f=m*10;
            System.out.println(f);
            for (int k=0;k<nums.length;k++){
                int te=0;
                int x=nums[k];
                for (int s:nums){
                    te+=Math.abs(s-x);
                }
                if (te<f){
                    f=te;
                }
            }
            System.out.println(f);
        } 
    }
}
