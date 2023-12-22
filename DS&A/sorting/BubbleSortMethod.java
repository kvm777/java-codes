package sorting;

public class BubbleSortMethod {
    public static void main(String[] args) {
        int arr[] = {9,1,5,3,8,2,0,6,7,4};

        System.out.print("Before sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }

        int[] newArr = BubbleSort(arr);

        System.out.println();
        System.out.print("After Bubble sorting: ");

        for(int i:newArr){
            System.out.print(i+" ");
        }
        
    }

    private static int[] BubbleSort(int[] array) {
        for(int i=0 ; i < array.length; i++){
            for(int j=0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    array[j] = array[j] + array[j+1] -( array[j+1] = array[j] );
                }
            }
        }
        return array;
    }
}
