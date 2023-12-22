package problems;

import java.util.Scanner;
public class NumCrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<2*n;j++){
                if (j==i || j==2*n-i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int k=n-1;k>0;k--){
            for (int j=1;j<2*n;j++){
                if (j==k || j==2*n-k){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
