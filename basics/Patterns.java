package basics;
public class Patterns {
    public static void main(String[] args) {

        System.out.println("1: normal star pattern ");
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=4;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("2: triangular star pattern");
        for (int i=0;i<=4;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("3: top left cornerned triangular star pattern");
        for (int i=0;i<=4;i++)
        {
            for (int j=i;j<=4;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("4: top right cornerned triangular star pattern");
        for (int i=0;i<=4;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("  ");
            }
            for (int k=4;k>=i;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("5: down right cornerned triangular star pattern");
        for (int i=0;i<=4;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print("  ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("6: number pattern");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("7: num pattern");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("8: triangular num pattern");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("9: box star pattern");
        for (int i=0;i<=4;i++)
        {
            for (int j=0;j<=4;j++)
            {
                if (i==0 || i==4 || j==0 || j==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("10: special num pattern");      
        for (int i=1;i<=5;i++)                                  //1 2 3 4 5
        {                                                       //2 3 4 5 1
            for (int j=1;j<=5;j++)                              //3 4 5 1 2 
            {                                                   //4 5 1 2 3
                int k=i+j-1;                                    //5 1 2 3 4
                if (k>5)
                    System.out.print(k-5+" ");
                else
                    System.out.print(k+" ");
            }
            System.out.println();
        }

        //1 2 3 4 4 3 2 1
        //1 2 3 * * 3 2 1
        //1 2 * * * * 2 1
        //1 * * * * * * 1

        System.out.println("11: Special patter 2..");

        for (int i=0;i<4;i++){
            for (int j=1;j<=(4-i);j++){
                System.out.print(j+" ");
            }
            for(int k=0;k<(i*2);k++){
                System.out.print("* ");
            }
            for(int l=(4-i);l>0;l--){
                System.out.print(l+" "); 
            }
            System.out.println();
        }
    }
}
