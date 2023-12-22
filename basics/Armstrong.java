package basics;
public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int t=n,r,s=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+(r*r*r);
        }
        if(t==s)
            System.out.println("it is an armstrong number");
        else
            System.out.println("not an armstrong number");
    }
}
