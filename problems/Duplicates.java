package problems;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        HashSet  hs = new <String> HashSet();
        String arr[] = {"java","python","c++","java"};

        boolean flag = true;
        for (String i :arr){
            if(hs.add(i)==false){
                System.out.println("duplicate element found : "+i);
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("duplicate elements not found..");
        }
    }
}
