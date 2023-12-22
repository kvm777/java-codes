package basics2;

/*
 * inner or member class.. 
 * nested or static class.... ---it can't use mostly
 * anonymous class
 * lambda expression..
 */
public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B(); // obect creation for inner class usage in java...
        b.show();

        C c = new C() {
            public void show() {
                System.out.println("hii..!!");
            }
        };      //anonymous class representation...
        c.show();

        D d =() -> {
            System.out.println("hello...");
        };
        d.show();

        D d1 = () -> System.out.println("simply one line denotion...!!");
        d1.show();
    }
}

// class for non static or member inner class...
class A {
    int rollno;
    String sname;

    class B {
        public void show() {
            System.out.println("Hello...");
        }
    }
}

// anonymous class..
class C {
    public void show() {
        System.out.println("Helloooooo...!!!!");
    }
}

//class for the lambda expression...
@FunctionalInterface
interface D{
    void show();
}