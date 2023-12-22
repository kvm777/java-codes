package basics;
import java.util.Random;
import java.util.Scanner;

public class Enhancedfor {
    public static void main(String[] args) {
        int a[] = new int[5];           //array iniation
        Scanner sc= new Scanner(System.in);

        for (int i=0;i<a.length;i++)       //normal loop
        {
            a[i]=sc.nextInt();      //taking inputs into array
        }

        for (int i:a)               //enhanced loop
        {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("printing using random class");
        Random r = new Random();        
        int b[]=new int[20];

        for (int i=0;i<b.length;i++)
        {
            b[i]=r.nextInt(50);     //random inputs
        }

        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}
