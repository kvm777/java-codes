package oops;

/*
 getters and setters.......
 make variables private in class and get it by setters and getters in main class...
 */
public class Encapsulation {
    public static void main(String[] args) {
        Encap obj1 =new Encap();
        //obj1.i=5;
        obj1.setI(5);
        //obj1.s="mahesh";
        obj1.setS("mahesh");

        System.out.println(obj1.getI());
        System.out.println(obj1.getS());

    }
}

class Encap{
    private int i;          //making variables private...
    private String s;
    
    public int getI()                //get method
    {
        return i;
    }
    public void setI(int i)         //set method
    {
        this.i=i;
    }
    public String getS()
    {
        return s;
    }
    public void setS(String s)
    {
        this.s=s;
    }
}