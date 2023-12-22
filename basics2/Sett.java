package basics2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//hashset and treeset.... in set
public class Sett {
    public static void main(String[] args) {
        Set <Integer> s = new HashSet<>();
        System.out.println(s);
        s.add(92);
        s.add(84);
        s.add(22);
        s.add(100);

        System.out.println(s);

        Set <Integer> s1 = new TreeSet();
        System.out.println(s1);
        s1.add(92);
        s1.add(84);
        s1.add(22);
        s1.add(100);

        System.out.println(s1);

    }
}
