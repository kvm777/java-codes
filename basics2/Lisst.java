package basics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet; 
import java.util.List;
import java.util.Set;
import java.util.TreeSet; 


/*
 * list
 * Hashset
 * Treeset...
 * Arrays.asList
 * for each API lambda expression...
 */
public class Lisst {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList<>();
        l1.add(5);
        System.out.println(l1.get(0));
        l1.add(0, 6);
        l1.add(2);
        l1.add(6);
        l1.add(9);
        l1.add(22);
        l1.add(11);
        l1.add(7);
        System.out.println(l1);
        
        //sorting of list...!!!
        Collections.sort(l1);
        System.out.println(l1);

        //reverse of list...
        Collections.reverse(l1);
        System.out.println(l1);


        //for each in list ....!!
        l1.forEach(System.out::println);    //Stream API ..lambda expression

        //Arrays.asList when we know elements...
        List <Integer> l2 = Arrays.asList(10,20,30);
        System.out.println(l2);

        //instantiation initializers... using double bracesas below
        List <Integer> l3 = new ArrayList<>()
        {{
            add(1);
            add(22);
            add(223);
        }};
        System.out.println(l3);

        Set <Integer> s = new HashSet<>();
        s.add(4);
        s.add(2);
        s.add(9);
        s.add(1);
        s.add(0);

        System.out.println(s);

        Set <Integer> s1 = new TreeSet<>();
        s1.add(4);
        s1.add(2);
        s1.add(9);
        s1.add(1);

        System.out.println(s1);
    }
}

