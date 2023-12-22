package basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int k=0,a=1,b=1;
        System.out.println("enter upto which number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("1 1 ");
        while (k<=n)
        {
            k=a+b;
            if(k>n)
                break;
            System.out.print(k+" ");
            a=b;
            b=k; 
        }
        System.out.println();

        System.out.println("Enter Num of Fibonacci numbers");
        int m=sc.nextInt();
        System.out.print("1 1 ");
        int x=1,y=1,z=0;
        for (int i=2;i<m;i++)
        {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }
    }
}
