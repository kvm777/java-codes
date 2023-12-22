package basics;
public class Loops {
    public static void main(String[] args) {
        int i=1;
        System.out.println("while loop");
        while(i<10)        //while loop
        {
            System.out.println(i);
            i++;
        }
        
        int j=1;
        System.out.println("do while loop");

        do                  //do while loop
        {
            System.out.println(j);
            j++;
        }while (j<=5);

        System.out.println("for loop");
        
        for (int k=1;k<=10;k++)        //for loop
        {
            System.out.print(k+" ");
        }
    }
}
