package basics2;

//the program to print hello and hii alternatively..


public class MultiThread1 {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        //obj1.show();
        //obj2.show();
        //instead of using show ..use run method to implement threading..

        obj1.start();
        try { Thread.sleep(5);} catch (Exception e) {}
        obj2.start();
    }
}


class Hi extends Thread{
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hi...");
            try { Thread.sleep(500); } catch (Exception e){}
        }
    }
}

class Hello extends Thread{
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Hello...");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
