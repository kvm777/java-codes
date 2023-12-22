package basics;
public class Labelledbreak {
    public static void main(String[] args) {
        
        mahesh:                          //labelled break
        for(int i=0;i<=4;i++)
        { 
            for (int j=0;j<=4;j++)
            {
                if (i==3)
                    break mahesh;         //unlabelled break
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
