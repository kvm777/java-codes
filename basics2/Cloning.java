package basics2;

public class Cloning {

    /*
     * Shallow
     *      --in shallow copy -it is created two reference with one object...!!!
     * Deep
     * Clone
     */
    public static void main(String[] args) throws CloneNotSupportedException
     {

        //Shallow copy...!!
        Abc obj = new Abc();
        obj.i = 5;
        obj.j = 6;

        Abc obj1 = obj;
        obj1.j = 8;
        System.out.println("Shalloww copy...");
        System.out.println(obj1);   //i=5, j=8
        System.out.println(obj);    //i=5, j=8

        //Deep copy...!!
        Abc obj3 = new Abc();
        obj3.i = 5;
        obj3.j = 6;

        Abc obj4 = new Abc();
        obj4.i = obj3.i;
        obj4.j = obj3.j;

        obj4.j = 8;
        System.out.println("Deep copy...");
        System.out.println(obj3);   //i=5, j=6
        System.out.println(obj4);   //i=5, j=8

        //Clonng...!!
        Abc obj5 = new Abc();
        obj5.i = 5;
        obj5.j = 6;

        Abc obj6 = (Abc)obj5.clone();
        obj6.j = 8;

        System.out.println("Cloning....");
        System.out.println(obj5);   //i=5, j=6
        System.out.println(obj6);   //i=5, j=8
    }
}

class Abc implements Cloneable
{
    int i;
    int j;

    @Override
    public String toString(){
        return "Abc(" + "i=" + i + ", j=" + j + ")";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}