package unknowns;

import java.util.Scanner;

public class Yasmeen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int x = (int)s.charAt(0)+(int)s.charAt(s.length()-1)-96;
        //int x = Integer.valueOf(s.charAt(0)) + Integer.valueOf(s.charAt(s.length()-1));
        int y=0;
        for (int i=1;i<s.length()-1;i++){
            //int k=s.charAt(i)-48;
            y+=s.charAt(i)-48;
            //y+=Integer.valueOf(s.charAt(i));
        }
        if(x>y)
            System.out.println(x+" is big");
        else
            System.out.println(y+" is big");
    }
}
