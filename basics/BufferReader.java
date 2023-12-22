package basics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws Exception     //exception for bufferreader..
     {
        System.out.println("enter any number... ");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);

        int i= Integer.parseInt(bf.readLine());     //"45" -- 45
        System.out.println(i);

    }
}
