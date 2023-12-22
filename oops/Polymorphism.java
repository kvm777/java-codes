package oops;


public class Polymorphism {
    public static void main(String[] args) {
        Poly obj = new Poly();
        obj.show(5);        //method overloading
        B obj1 = new B();
        obj1.show();          // method overriding..

    }
    
}
/*
method overloading , early binding, static binding, compile time polymorphism...
-->having same method name which passing different parameters 
*/

class Poly
{
    public void  show()
    {
        System.out.println("in poly class");
    }
    public void show(int i){
        System.out.println("in int poly "+i);
    }
}

/*
mmethod overriding..late binding..Dynamic binding...run time polymorphism...
 2 methods with same name having same number of parameters, both belongs to different classes
 are linked with inheritance...
 */

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}