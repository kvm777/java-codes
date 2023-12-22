package basics;
import java.util.Scanner;

public class PerfectNumber {
    
    //6 ---> 1+2+3=6
    //28 ---> 1+2+4+7+14=28

    public static void main(String[] args) 
    {
        System.out.println("enter a number to chech wether it is perfect number or not");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b=isPerfect(n);
        if(b)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not perfect number");

    }

    public static boolean isPerfect(int n)
    {
        int t=0;
        for (int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                t+=i;
        }
        if (t==n)
            return true;
        return false;
    }


}
