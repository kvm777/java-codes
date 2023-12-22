
//NOT DONE

package unknowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jun06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int Arr[] = new int[n];
        for(int i=0; i<n ;i++){
            Arr[i] = sc.nextInt();
        }

        System.out.println(solution(Arr));
    }

    public static int solution(int[] A) {
        int n = A.length;
        
        List <Integer> l = new ArrayList<Integer>();
        List <Integer> maxList = new ArrayList<Integer>();
        for (int i = 0; i<n-1; i++) {
           int t1 = A[i]+A[i+1];
          
        }
        int maxSum=0;
        if (l.size()<=4){
            for(int k=0;k<l.size();k++){
                Integer x = Collections.max(l);
                maxSum += x;
                l.remove(x);
            }
        }
        else{
            for(int k=0;k<3;k++){
                Integer x = Collections.max(l);
                maxSum += x;
                l.remove(x);
            }
        }
        
        return maxSum;
     }
}


// public static int solution(int[] A) {
//     int N = A.length;
//     int maxSum = 0;
//     int maxSumOneTile = 0;
//     int maxSumTwoTiles = 0;

//     for (int i = 0; i < N; i++) {
//        int currentSumOneTile = A[i] + maxSumOneTile;
//        int currentSumTwoTiles = A[i] + maxSumTwoTiles;
//        int currentSumThreeTiles = A[i] + maxSumTwoTiles;

//        maxSumOneTile = Math.max(currentSumOneTile, maxSumOneTile);
//        maxSumTwoTiles = Math.max(currentSumTwoTiles, maxSumTwoTiles);
//        maxSum = Math.max(Math.max(currentSumThreeTiles, maxSumTwoTiles), maxSum);
//     }

//     return maxSum;
//  }