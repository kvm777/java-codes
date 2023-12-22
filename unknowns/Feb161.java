package unknowns;

import java.util.Arrays;
import java.util.Scanner;

public class Feb161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String lst[] = s.split(" ");
        
        System.out.println(Arrays.toString(lst));
        String out = lst[0];

        for (String i:lst){
            if((i.length()>out.length()) || ((i.length()==out.length()) && (i.charAt(0)<out.charAt(0)) )){
                out=i;
            }

        }
        System.out.println(out+" "+out.length());
    }
}
