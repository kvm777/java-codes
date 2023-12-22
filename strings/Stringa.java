import java.util.Scanner;

public class Stringa {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 strings..");
        s1=sc.nextLine();
        s2=sc.nextLine();

        //length method..
        int l1= s1.length();
        int l2= s2.length();

        System.out.println("length of string 1 : "+ l1);
        System.out.println("length of string 2 : "+ l2);

        // concatination...
        String s3= s1+s2;      // s1.concat(s2)
        System.out.println("concatination of 2 strings..: "+ s3);

        //make strings to uppercase..
        String s4=s1.toUpperCase();
        System.out.println("the uppercase of string 1: "+s4);
    }
}
