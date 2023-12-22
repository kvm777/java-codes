package basics2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* 
 * it was implemented from anamymous
 * map      -->>exmpl  map(i -> i*2)    
 *      ---it was imported as arr.stream().map(...)
 * reduce   -->>exmp   reduce(initial:0 , (c,e) -> c+e)     ...c is carrier,e is elements in array    
 *      --- array.stream().reduce(.....)
 * filter
 */
public class StreamAPI2 {
    public static void main(String[] args) {
        
        List <Integer> values = Arrays.asList(1,2,3,4,5,6,7);

        //the program to summation of double the elements..

        //1.normal method..
        int r=0;
        for (int i : values){
            r+= i*2;
        }

        System.out.println("by normal method : "+r);

        //using map and reduce..
        
        System.out.println("using stramAPI : "+values.stream().map(i ->i*2).reduce(0, (x,y) -> x+y));
        System.out.println("using stramAPI : "+values.stream().map(i ->i*2).reduce(0, Integer::sum));
        //c+e is same as Integer.sum(c,e)  or  Integer::sum  --it was used for many large functions..

        List <Integer> l1 = Arrays.asList(12,30,45,27,45,10,66);
        
        Stream ss = l1.stream().filter(i -> i%5==0);
        //System.out.println((ss.toList()));
        List <Integer> l2 = ss.toList();
        System.out.println(l2);
        System.out.println(l2.stream().reduce(0, Integer::sum));

        List <Integer> l3 = Arrays.asList(2,4,6);
        

        //findFirst method...   orElse method....
        System.out.println(l3.stream()
                            .filter(i -> i%5==0)
                            .findFirst()
                            .orElse(-1)
        );

    }
}
