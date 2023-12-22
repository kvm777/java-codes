package basics;
public class Prime {
    public static void main(String[] args) {
        int n=53;

        if (n==1 || n==0)
        {
            System.out.println("invalid input");
        }
        else if(n==2)
        {
            System.out.println("prime number");
        }
        else
        {
            int c=0;
            for (int i=1;i<=n;i++)
                if (n%i==0)
                    c+=1;
            if (c==2)
                System.out.println("prime num");
            else
                System.out.println("not a prime num");
        }
    }
}
