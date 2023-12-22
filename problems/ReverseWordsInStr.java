package problems;

import java.util.Arrays;

public class ReverseWordsInStr {
    public static void main(String[] args) {
        String str = "welcomr to java";
        //approach1:
        String l[] = str.split(" ");
        System.out.println(Arrays.toString(l));

        String rev="";
        for(String i:l){
            String w="";
            for(int j=i.length()-1;j>=0;j--){
                w+=i.charAt(j);
            }
            rev+=w+" ";
        }
        System.out.println(rev);

        //approach2 -- using StringBufferClass
        String l1[] = str.split("\\s");
        System.out.println(Arrays.toString(l1));
        String rev1="";
        String rev2="";
        for(String i:l1){
            StringBuffer sbf = new StringBuffer(i);
            sbf.reverse();
            rev1+=sbf+" ";

            //approach3 -- using StringBuilderClass
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();
            rev2+=sb+" ";
        }
        System.out.println(rev1);
        System.out.println(rev2);
    }
}
