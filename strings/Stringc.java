import java.util.Scanner;

//stringReverse...
//by 2 methods..1:using customised logic
//              2:using standard API method..

public class Stringc {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse: ");

        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String rev="";
        
        //1:using customised logic...
        for(int i=original.length()-1;i>=0;i--){
            rev+=original.charAt(i);
        }

        //2:using standard API method...
        StringBuffer sb =new StringBuffer(original);
        String rev1 = sb.reverse().toString();

        if(original.equals(rev)){
            System.out.println("its Palindrome");
        }
        else{
            System.out.println("can`t");
        }


        System.out.println("Original String : "+original);
        System.out.println("reversed string1 : "+rev);
        System.out.println("reversed string2 : "+rev1);
    }
}
