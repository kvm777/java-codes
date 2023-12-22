package Examples;

import java.util.ArrayList;

public class Stack1 {
    ArrayList <Integer> s = new ArrayList<>();
    private boolean push(int e){
        s.add(e);
        System.out.println("elements pushed into stack="+e);
        return true;
    }
    private int pop(){
        int len=s.size();
        int g= s.get(len-1);
        s.remove(len-1);
        System.out.println("element popped from stack="+g);
        return g;
    }

    private void peek(){
        int p= s.get(s.size()-1);
        System.out.println("your peek value is = "+p);
    }
    private boolean show(){
        System.out.println("your final array"+s);
        System.out.println(s.size());
        return true;
    }

    
    public static void main(String[] args) {
        Stack1 s1=new Stack1();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.pop();
        s1.pop();
        s1.peek();
        s1.show();
        
    }
}
