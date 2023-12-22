package basics;
/*
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 0 1 0 1 0 1 
 */

public class PatternExamples {
    public static void main(String[] args) {
        int n=6;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                int k=i+j;
                if (k%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}