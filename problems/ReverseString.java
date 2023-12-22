package problems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string..!!!");
        String str = sc.nextLine();
        String rev = "";

        //1) using + concatanation operator..
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        System.out.println("revers string using concatination method "+rev);

        //2) using character array..
        char a[] = str.toCharArray();
        String rev1="";
        for(int i=a.length-1;i>=0;i--){
            rev1+=a[i];
        }
        System.out.println("revers string using toCharArray method "+rev1);


        //3) using stringBuffer class..
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev2 = sb.reverse(); 
        System.out.println("revers string using StringBuffer class "+rev2);


    }
}
