package oops;

public class Abstraction {
    public static void main(String[] args) {
        myphone obj = new sureshphone();  //can't instantiate the abstact class..
        obj.call();
        obj.dance(); 
        obj.move();
        obj.cook();
    }
}

/*
 * whenever we declear the methods ..the methods called as abstact methods..
 * abstract class  --->>> the class which contains abstac methods. and it also define with abstract keyword..
 * abstraction which only shows methods and hiding the implementation..
 */

abstract class myphone{                 //abstract class
    public void call(){
        System.out.println("calling.....");
    }
    public abstract void dance();       //abstact methods
    public abstract void move();
    public abstract void cook();
}

abstract class rameshphone extends myphone{         //this also abstract class
    public void dance(){
        System.out.println("phone is dancing...");
    }
}

class sureshphone extends rameshphone{              //concrete class..
    public void move(){
        System.out.println("phone is moving..");
    }
    public void cook(){
        System.out.println("phone is cooking...");
    }
}