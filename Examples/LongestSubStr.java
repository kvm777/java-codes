package Examples;

import java.util.HashSet;
//longesgt substring without repeatation of characters...
public class LongestSubStr {
    public static void main(String[] args) {
        String s="abcdab";
        longest(s);
    }

    public static void longest(String str) {
        HashSet <Character> set = new HashSet<>();
        String overAll="";
        String till="";
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(set.contains(c)){
                till="";
                set.clear();
            }
            till+=c;
            set.add(c);

            if (overAll.length()<till.length()){
                overAll=till;
            }
        }
        System.out.println(overAll);
    }
}
