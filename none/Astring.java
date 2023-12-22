package none;
import java.util.Arrays;
import java.util.Scanner;
public class Astring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string....");
        String s1 = sc.nextLine();
        System.out.println("enter another string..");
        String s2 = sc.nextLine();


        System.out.println("string1 length is "+s1.length());
        System.out.println("string2 length is "+s2.length());


        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i)+" ");
        }

        System.out.println();
        
        for(int i=0;i<s2.length();i++){
            System.out.print(s2.charAt(i)+" ");
        }
        System.out.println();

        String s3 = s1+" "+s2;          //addition of string... using normal method....
        String s4 = s1.concat(" ".concat(s2));  //addition of string... usoing conact method...

        System.out.println(s3);
        System.out.println(s4);

        System.out.println("to upper case : "+s3.toUpperCase());
        System.out.println("to lower case : "+s4.toLowerCase());


        //usoing normal method..
        String rev1 = ""; 
        for(int j=s3.length()-1;j>=0;j--){
            rev1+=s3.charAt(j);
        }

        System.out.println("reversed string 1 : "+rev1);

        //using API method..
        StringBuffer sb = new StringBuffer(s3);
        String rev2 = sb.reverse().toString();

        System.out.println("reversed string using API method : "+rev2);
        System.out.println();

        System.out.println("enter space separated names..");
        String[] str = sc.nextLine().split(" ");

        System.out.println(Arrays.toString(str));


        for(String i:str){
            System.out.print(i+" ");
        }

    }
}
