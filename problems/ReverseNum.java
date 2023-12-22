package problems;

import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int num=sc.nextInt();
        int rev=0;
        int t=num;
        //normal method
        while(t>0){
            rev=(rev*10)+t%10;
            t=t/10;
        }
        System.out.println("the reverse num by using normal method is "+rev);

        //using StringBuffer class
        StringBuffer sbf = new StringBuffer(String.valueOf(num));
        StringBuffer rev1 = sbf.reverse();
        System.out.println("the reverse num by using StringBuffer method is "+ rev1);

        //using StringBuilder class
        StringBuilder sbl = new StringBuilder();
        StringBuilder rev2 = sbl.append(num);
        rev2.reverse();
        System.out.println("the reverse num by using StringBuilder method is "+rev2);
        
    }
    
}
