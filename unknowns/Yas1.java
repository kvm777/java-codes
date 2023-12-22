package unknowns;

import java.util.Scanner;

/*
 * mahesh
 * 3
 * hamesh
 */

public class Yas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0));
        int n = sc.nextInt();

        String out="";

        for (int i=n-1;i>=0;i--){
            out+=s.charAt(i);
        }
        System.out.println(out);

        for(int j=n;j<s.length();j++){
            out+=s.charAt(j);
        }
        System.out.println(out);
    }
}
