package basics;
public class Swap {
    public static void main(String[] args) {
        int a=4,b=5;
        a=a+b;
        b=a-b;          //logic 1
        a=a-b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        int c=10,d=20;
        c=c^d;
        d=c^d;          //logic 2
        c=c^d;
        System.out.println("c : "+c);
        System.out.println("d : "+d);

        int m=50,n=100;
        n=m+n-(m=n);     //simple one line logic
        System.out.println("m : "+m);
        System.out.println("n : "+n);
    }
}
