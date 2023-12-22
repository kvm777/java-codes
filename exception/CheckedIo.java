package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedIo {
    public static void main(String[] args) {
        int i,j,k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i=8;
        try{
            System.out.println("enter any number..");
            j=Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println("your ouput : "+k);
        }
        catch(IOException e){
            System.out.println("some IO error");
        }
        catch (ArithmeticException e){
            System.out.println(e+" can't divide by zero..");
        }
        catch (Exception e){
            System.out.println("unknown Exception..");
        }
        finally{
            System.out.println("finally BYE");
        }
        
    }
}
