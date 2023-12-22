package oops;


public class SuperKeyword {
    public static void main(String[] args) {
        D obj =new D(6);
        obj.show();     //using super keyword..
        obj.abc();
    }
}

/*
 whenever we call the constructor in sub class ...by default it calls the construcor of super class.
 by default every construcor method of every class will hava keyword of super()...which will call the
  parent class.

  if we pass parameter to super() keyword ..it returns the super(para); of the parent class...
  super.para -- which calls the parameter from super class
  super.method() -- which calls the method from super class
 */
class C{           //super class

    int i=5;
    public C()
    {
        super();
        System.out.println("in const c");
    }
    public C(int i)
    {
        System.out.println("in const C para");
    }
    public void abc(){
        System.out.println("in C class abc method");
    }
}

class D extends C{      //sub class
    public D()
    {
        super();
        System.out.println("in const D");
    }
    public D(int i)
    {
        System.out.println("in const D para");
    }
    int i=4;
    public void show(){
        System.out.println("i value in this class : "+i);
        System.out.println("i value in super class : " +super.i);        //super keyword..it gives the i value from super class
    }
    public void abc(){
        super.abc();                    //also returns the method from parent class...
        System.out.println("in D class abc method");      
    }
}