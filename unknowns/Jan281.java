package unknowns;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jan281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> lst = new ArrayList<>();
        int n= sc.nextInt();
        int c=0;
        while(n>1){
            for (int i=n-1;i>=1;i--){
                if(n%i==0){
                    lst.add(i);
                }
            }
            n=n-lst.get(0);
            lst.clear();
            c+=1;
        }
        System.out.println(c);
    }
}
