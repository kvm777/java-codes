import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTutorial2 {
    public static void main(String[] args) {


        System.out.println("using PriorityQueue");
        Queue <Double> queue = new PriorityQueue<>();

        queue.offer(2.0);
        queue.offer(3.4);
        queue.offer(9.6);
        queue.offer(1.4);
        queue.offer(6.4);
        queue.offer(3.0);

        
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


        System.out.println("using PriorityQueue and Collections.reverseOrder()");
        Queue <Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        queue2.offer(2.0);
        queue2.offer(3.4);
        queue2.offer(9.6);
        queue2.offer(1.4);
        queue2.offer(6.4);
        queue2.offer(3.0);

        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }

    }
}
