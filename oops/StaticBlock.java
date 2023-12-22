package oops;

public class StaticBlock {

    static String s= "";
    static              //static 1
    {
        s="bye";
        System.out.println("hellooo in static block");
    }
    public static void main(String[] args) 
    {
        System.out.println("hello in main");
        System.out.println("the string is--->"+s);
    }

    static              //static 2
    {
        System.out.println("hii in static 2");
    }
}
