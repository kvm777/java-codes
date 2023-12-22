package sorting;

import java.util.Arrays;

public class InsertionSortMethod {
    public static void main(String[] args) {
        int arr[] = {9,1,5,3,8,2,0,6,7,4};

        System.out.print("Before sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }

        int[] newArr = Insertion(arr);

        System.out.println();
        System.out.print("After Bubble sorting: ");

        for(int i:newArr){
            System.out.print(i+" ");
        }
    }

    private static int[] Insertion(int[] array) {
        for(int i=1; i < array.length; i++){
            int min = array[i];
            int j = i-1;
            while( j>=0 && min < array[j] ){
                array[j+1] = array[j];
                j--;
                // System.out.println(i);
            } 
            array[j+1] = min;
            // System.out.println(Arrays.toString(array));
        }

        return array;
    }
}
