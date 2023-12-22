package basics;
public class Ascii {
    public static void main(String[] args) {
        
        //7 bits
        // 2^7 = 128 ascii characters
        //0-128 range

        for (int i=0;i<=127;i++)
        {
            System.out.printf(" %d : %c |",i,i);
        }
    }
}


