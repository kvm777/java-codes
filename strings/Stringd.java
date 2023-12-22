import java.util.Arrays;
import java.util.Scanner;

/*
 * string splitting from CSV(comma separated values..)
 */

public class Stringd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter names with , separation..");
        //String s1=sc.nextLine();
        //String l[]=s1.split(",");
        String l[] = sc.nextLine().split(",");
        //list by Arrays class....
        System.out.println(Arrays.toString(l));
        for(String i:l){
            System.out.println(i+" ");
        }
    }
}

