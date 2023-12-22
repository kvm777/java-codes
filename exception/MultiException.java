package exception;

//multiple exceptions...UnChecked..
public class MultiException {
    public static void main(String[] args) {
        int i,j,k=0;
        i=5;
        j=2;
        int a[] = new int[4];
        try{
            k=i/j;
            for (int x=0;x<=a.length;x++)  //0 1 2 3 4
            {
                a[x]=x+1;
            }

        }
        catch (ArithmeticException e){
            System.out.println(e+" can't divide by zero..");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of range..");
        }
        catch (Exception e){
            System.out.println("unknown Exception..");
        }
    }
}
