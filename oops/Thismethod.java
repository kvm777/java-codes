package oops;

public class Thismethod {
    public static void main(String[] args) {
        th obj = new th(5);
        obj.show();
    }
    
}

/*
 * instance variable --->>> variable which is used inside the class outside of the method ...
 * local variable --->>> variable which is used inside the class inside the method...
 * this ..this method is used in encapsulation by getters and setters...
 */
class th{
    private int i;      //instance variable
    public th(int i){   //local variable
        this.i=i;       //curent instance
    }
    public void show(){
        System.out.println("x is : "+ i);
    }
}
