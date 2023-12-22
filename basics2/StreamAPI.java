package basics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
 * colletions and generics.. --Dynamic type array..
 * 
 * iterators and enhanced for loop in java...
 * forEach lambda expression...
 * consumer interface and lambda for each....
 * consumer iterface and for each .....
 * lambda expression in functional interface....
 */
public class StreamAPI {
    public static void main(String[] args) throws Exception
    {
        ArrayList value = new ArrayList();
        value.add(5);
        value.add("Mahesh");
        value.add(2.3f);

        System.out.println(value);


        System.out.println("using iterator..!!!");
        Iterator i = value.iterator();
        /* 
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        */

        
        System.out.println();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        System.out.println("using enhanced for loop....!!!");
        for (Object j:value){
            System.out.println(j);
        }

        List <Integer> l = Arrays.asList(1,2,3,4,5,6);

        //1..for each method ...lambda expression..
        l.forEach(k -> System.out.print(k+" "));

        System.out.println();
        l.forEach(System.out::println);     //2...for each method reference...

        //3...for each in java
        //doubleit method in the below of code....
        l.forEach(y -> doubleit(y));

        System.out.println();
        //amother method...
        l.forEach(StreamAPI::doubleit);

        
        System.out.println();
        //consumer interface using lambda expression...
        Consumer <Integer> c1 = (b) -> System.out.print(b+" ");

        l.forEach(c1);
        


        System.out.println();
        //using consumer interface...
        List <Integer> l1 = Arrays.asList(1,2,3,4,5,6,7);

        Consumer <Integer> c = new Consumer<Integer>() {
            public void accept(Integer a){
                System.out.print(a+" ");;
            }
        };

        l1.forEach(c);

        
        System.out.println();
        //lambda expression in functional interface....
        List <Integer> l3 = Arrays.asList(10,20,30,40,50,60);

        l3.forEach(new Consumer<Integer>() {
            public void accept(Integer e){
                System.out.print(e+" ");
            }
        });
        
    
    }
    public static void doubleit(int x) {
        System.out.print(x*2+" ");
    }
}
