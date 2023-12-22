import java.util.Stack;

/* 
 * Stack --- LIFO - Last In First Out
 *          stack gives the 1st index of 1 to the last element we pushed..
 *          stack.push("ele")       -- used to add element to stack
 *          stack.pop()             --removes the last element of stack
 *          stack.peek()            -- shows the last element of stack
 *          stack.search("ele")     -- gives the element place
 *          stack.isEmpty()         -- returns true if the stck is empty..
 */

public class StackTutorial {
    public static void main(String[] args) {
        
        Stack <String> stack = new Stack<String>();

        stack.push("mahesh");   // add element to stack
        stack.push("ravi");
        stack.push("sravan");
        stack.push("raja");
        stack.push("mukesh");
        stack.push("john");

        stack.pop();                // removes the last element we add
        stack.pop();
        System.out.println(stack.peek());           //raja
        System.out.println(stack.search("ravi"));   //3
        System.out.println(stack);          //[mahesh, ravi, sravan, raja]
    }
}