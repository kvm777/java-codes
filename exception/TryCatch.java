package exception;
/*
 *  Throwable
 *      -Exception
 *          -checked
 *              -IOException
 *              -SQLException
 *          -Unchecked
 *              -RunTimeException
 *                  -ArthematicException
 *      - catch
 */
//unchecked exception...
public class TryCatch {
    public static void main(String[] args) {
        int i,j,k=0;
        i=5;
        j=0;
        try{
            k=i/j;
        }
        catch (Exception e){
            System.out.println(e+" can't divide by zero..");
        }

        System.out.println(k);
    }
}
