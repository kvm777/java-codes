package basics;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter any number to check palindrome or not");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,s=0;
        int t=n;
        while(t>0)
        {
            r=t%10;     //remainder
            t=t/10;     //1234  ---- 1230
            s=s*10+r;
        }
        if (n==s)
            System.out.println(n+" is palindrome");
        else
            System.out.println(n+"is not palindrome");
    }
}
