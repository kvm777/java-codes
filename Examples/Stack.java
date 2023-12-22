package Examples;

import java.util.ArrayList;

//is needs some implementations... those are all in Stack1

public class Stack {
    int s[] = new int[5];
    int top=0;
    private boolean push(int e){
        top++;
        System.out.println(top);
        s[top]=e;
        System.out.println("elements pushed into stack="+e);
        return true;
    }
    private int pop(){
        int e=s[top--];
        System.out.println("element popped from stack="+e);
        return e;
    }

    private int peek(){
        int p=s[top];
        return p;
    }
    private boolean show(){
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i:s){
            arr.add(i);
        }
        System.out.println(arr.toString());
        return true;
    }

    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.pop();
        s1.peek();
        s1.show();

    }
}
