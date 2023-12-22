package basics;
public class DimensionalArray {
    public static void main(String[] args) {
        int p[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {4,3,2,1}
                    };
        System.out.println("normal for loop for 2Darray");
        for (int i=0;i<3;i++)           //normal for loop
        {
            for (int j=0;j<4;j++)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }

        
        System.out.println("enhanced for loop for 2D array");
        for(int i[]:p)                  //enhanced for loop
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("jaged array");
        int k[][] = new int[3][];       //jagged array notation
        k[0] = new int[4];
        k[1] = new int[2];
        k[2] = new int[5];

        for(int i=0;i<k.length;i++)
        {
            for (int j=0;j<k[i].length;j++)
            {
                k[i][j]=i+j+1;
            }
        }

        for (int i[]:k)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("3D array");     //3D ARRAY.......
        int x[][][]=new int[4][4][4];

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
            {
                for (int m=0;m<4;m++)
                {
                    x[i][j][m]=i+j+m;
                }
            }
        }

        for (int i[][]:x)
        {
            for (int j[]:i)
            {
                for (int m:j){
                    System.out.print(m+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
