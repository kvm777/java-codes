package basics;
public class Varangs {
    public static void main(String[] args) {
        Display obj1=new Display();
        obj1.show(5);
        obj1.show(1,2,3,4,5);;

    }
}

class Display{
    public void show(int ...a){         //varang ---->variable aurgments
        for (int i:a){
            System.out.println(i);
        }
    }
    public void show(int a){
        System.out.println(a+" in show method");
    }
}
