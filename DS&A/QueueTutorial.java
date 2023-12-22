import java.util.LinkedList;
import java.util.Queue;


/*
 * Queue --- FIFO - First In First Out
 *          Queue.offer("ele")       -- used to add element to Queue
 *          Queue.poll()             --removes the last element of Queue
 *          Queue.peek()            -- shows the last element of Queue --return null if the queue is empty
 *          Queue.element()         -- shows the last element of Queue --return error if the queue is empty
 *          Queue.contains("ele")     -- return true if the Queue conains the element
 *          Queue.size()            -- returns the size of Queue
 *          queue.isEmpty()         -- returns true is the Queue is empty
 */

public class QueueTutorial {
    public static void main(String[] args) {
        
        Queue <String> queue = new  LinkedList<String>();

        queue.offer("mahesh");   // add element to stack
        queue.offer("ravi");
        queue.offer("sravan");
        queue.offer("raja");
        queue.offer("mukesh");
        queue.offer("john");

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        // System.out.println(queue.element());
        System.out.println(queue.peek());
        
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains("ravi"));
        System.out.println(queue.size());
        System.out.println(queue);
    }
}
