import java.util.Scanner;

/*
 * remove characters from number...
 * 234bb4344h55jjj433333
 * 2334455433333
 */

public class Stringg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        s1=convert(s1);
        System.out.println(s1);
    }
    public static String convert(String str){
        StringBuffer sb =new StringBuffer(str);
        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i)<48 || sb.charAt(i)>57){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}

