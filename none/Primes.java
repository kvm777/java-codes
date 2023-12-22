package none;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(prime(a, b, c, d));

    }
    public static Integer prime(int n1,int n2,int n3,int n4){
        List <Integer> arr = new ArrayList<Integer>();
        int[] input = {n1,n2,n3,n4};
        for(int k=0;k<input.length;k++){
            if (k%2==0){
                int count=0;
                for(int i=input[k]; i<=input[k+1]; i++){
                    int c=0;
                    for(int j=1;j<=i;j++){
                        if (i%j==0){
                            c++;
                        }
                    }
                    if (c==2){
                        count++;
                    }
                }
                arr.add(count);
                count=0;
            }
        }
        //System.out.println(arr);
        return arr.get(arr.size()-1);
    }
}
