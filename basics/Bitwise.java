package basics;
public class Bitwise {
    public static void main(String[] args)
    {
        int a=25;
        int b=15;

        int c=a&b;
        int d=a|b;
        System.out.println("for OR :"+d+" for AND :"+c);

        boolean f=true;
        f=!f;
        System.out.println(f);
    }
}
