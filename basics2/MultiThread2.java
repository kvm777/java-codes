package basics2;

//using runable inteface... 
//join method will 2 threads and wait for each methods and complete the task...

public class MultiThread2 {
    public static void main(String[] args) throws Exception
     {
        Runnable obj1 = new Runnable() {
                public void run() {
                    for (int i=0;i<5;i++){
                        System.out.println("Hi...");
                        try { Thread.sleep(500); } catch (Exception e){}
                    }
            }
        };

        Runnable obj2 = () ->
        {
            for (int i=0;i<5;i++){
                System.out.println("Hello...");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        };

        //thread defining...
        Thread t1= new Thread(obj1,"Hii Thread....");      //name giving to thread
        Thread t2= new Thread(obj2);

        t2.setName("Hello Thread....");

        System.out.println("1 : "+t1.getName());
        System.out.println("2 : "+t2.getName());


        t1.start();
        try { Thread.sleep(6);} catch (Exception e) {}
        t2.start();

        //join method implements..   but it raises an Exception..

        System.out.println(t1.isAlive());
        t1.join(); 
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye.....");
    }
}

