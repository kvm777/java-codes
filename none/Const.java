package none;

public class Const {
    public static void main(String[] args) {
        None obj = new None();
        None obj1 = new None(5,6);
        obj1.out();
    }
}

class None{
    public None(){
        System.out.println("this is the constructor");
    }
    public int a,b;
    public None(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println(a + " parametric constructor..");
    }

    public void out(){
        int c = this.a+this.b;
        System.out.println("this is the output sum is "+c);
    }
}