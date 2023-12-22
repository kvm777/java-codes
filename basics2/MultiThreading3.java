package basics2;

//synchronized counter in multi threading..
//if u dont use synchronized... it is not safe due to multiple threads are working at the same time.. 
public class MultiThreading3 {
    public static void main(String[] args) throws Exception {
        counter c = new counter();

        Thread t1= new Thread(){
            public void run(){
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("count : "+ c.count);
    }
}


class  counter {
    int count;

    // synchronized keyword...
    public synchronized void increment(){
        count++;
    }
}