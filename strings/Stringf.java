/*
 * substring is in string or not..
 * using---1:using with in-built method
 *         2:using without in-built method..
 */
import java.util.Scanner;

public class Stringf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter srting");
        String s1= sc.nextLine();
        System.out.println("enter sub string..");
        String s2= sc.nextLine();

        boolean b = s1.contains(s2);
        if (b){
            System.out.println("it contains the string..");
        }
        else{
            System.out.println("it doesn't contains..");
        }

        int s1len=s1.length();
        int s2len=s2.length();
        char p,s;
        int c=0;
        for (int i=0;i<s1len-s2len;i++){
            p=s1.charAt(i);
            s=s2.charAt(i);
            if(p==s){
                for (int j=i,k=0;j<i+s2len;j++,k++){
                    p=s1.charAt(j);
                    s=s2.charAt(k);
                    if (p==s){
                        c++;
                    }
                }
            }
        }

        if (c==s2len){
            System.out.println("s2 contains s1");
        }
        else{
            System.out.println("s2 doesnot contains");
        }
    }
}
