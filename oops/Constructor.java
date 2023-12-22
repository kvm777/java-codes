package oops;

public class Constructor {
    public static void main(String[] args) {
        Abc obj1 = new Abc();             //constructor
        Xyz obj2 = new Xyz(10);
        Abc obj3 = new Abc(20); 
    }
}
/*
 the constuctor would return the output with initiation....
 */
class Abc{
    public Abc(){      
        System.out.println("normal constuctor");
    }
    public Abc(int k){                      //method overloading.....
        System.out.println(k+" overloaded constructor");
    }
}


class Xyz{
    public Xyz(int i){
        System.out.println(i+" patametarised constructor");
    }
}

