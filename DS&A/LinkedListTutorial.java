import java.util.LinkedList;

/*
 * LinkedList   --- Stores nodes in 2 parts..(data + Address)
 *                  nodes are in non-consecutive memory locations..
 *                  elements are linked using pointers
 */


public class LinkedListTutorial {

    public static void main(String[] args) {

        LinkedList <String> linkedlist = new LinkedList<String>();


        // linkedList as stack...
        // linkedlist.push("mahesh");
        // linkedlist.push("ravi");
        // linkedlist.push("sravan");
        // linkedlist.push("raja");
        // linkedlist.push("mukesh");
        // linkedlist.push("john");

        
        //linkedList as queue
        // add element to stack
        // linkedlist.offer("mahesh");   
        // linkedlist.offer("ravi");
        // linkedlist.offer("sravan");
        // linkedlist.offer("raja");
        // linkedlist.offer("mukesh");
        // linkedlist.offer("john");

        linkedlist.add("mahesh");   // add element to stack
        linkedlist.add("ravi");
        linkedlist.add("sravan");
        linkedlist.add("raja");
        linkedlist.add("mukesh");
        linkedlist.add("john");

        linkedlist.addFirst("0");
        linkedlist.addLast("last");

        System.out.println(linkedlist.removeFirst());
        System.out.println(linkedlist.removeLast());

        System.out.println(linkedlist.peek());
        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        System.out.println(linkedlist);
    }
}
