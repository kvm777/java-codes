package basics;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int a[]=new int[5];

        for (int i=0;i<5;i++)
        {
            a[i]=i+1;
        }
        for (int j=0;j<5;j++)
        {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        System.out.println("the array " + Arrays.toString(a));
    }
}
