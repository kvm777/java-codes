package unknowns;

import java.util.Scanner;

public class Yassss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(none(n));
    }

    public static String none(int n){
        String s = Integer.toString(n);
        int e=0;
        int m=0;
        e=(int)s.charAt(0) + (int) s.charAt(s.length()-1) - 96;

        for (int i=1;i<s.length()-1;i++){
            m+=(int)s.charAt(i)-48;
        }
        System.out.println(e);
        System.out.println(m);

        if (e>m)
            return e+" is big...";
        else
            return m+" is big...";
        
    }
}
