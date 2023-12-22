package problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class ReadDataTextFile 
{
    public static void main(String[] args) throws IOException {
        //approach1 -- FileReadder and BufferReader class
        System.out.println("approach 1");
        FileReader fr = new FileReader("C:\\Users\\korad\\Desktop\\java examples\\problems\\Test.txt");
        BufferedReader br= new BufferedReader(fr);

        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        System.out.println();
        //approach2 -- usin file and scanner class
        File f= new File("C:\\Users\\korad\\Desktop\\java examples\\problems\\Test.txt");
        Scanner sc = new Scanner(f);
        //loop statement
        /* 
        System.out.println("approach 2");
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        */
        //approach3 --useDelimier
        System.out.println("approah 3");
        sc.useDelimiter("\\z");
        System.out.println(sc.next());
    }
    

}
