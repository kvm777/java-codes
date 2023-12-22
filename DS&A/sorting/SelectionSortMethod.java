package sorting;

public class SelectionSortMethod {
    public static void main(String[] args) {
        int arr[] = {9,1,5,3,8,2,0,6,7,4};

        System.out.print("Before sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }

        int[] newArr = SelectionSort(arr);

        System.out.println();
        System.out.print("After Selection sorting: ");

        for(int i:newArr){
            System.out.print(i+" ");
        }
    }

    
    private static int[] SelectionSort(int[] array) {
        
        for(int i=0; i < array.length; i++){
            int t =i;
            int min = array[i];
            for(int j=i+1; j < array.length; j++){
                if(min > array[j]){
                    min = array[j];
                    t=j;
                }
            }
            // array[i] = min + array[i] - (min = array[i]);
            array[i] = array[t] + array[i] - (array[t] = array[i]);
            
        }

        return array;
    }
}
