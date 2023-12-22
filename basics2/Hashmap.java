package basics2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map <Integer, Integer> mapp = new HashMap<>();
        mapp.put(1,10);
        mapp.put(4,40);
        mapp.put(2,20);
        mapp.put(5,50);
        mapp.put(5,20);

        System.out.println(mapp);

        Set <Integer> keys = mapp.keySet();

        for (int k:keys){
            System.out.println(k+ " : "+ mapp.get(k));
        }
    }
}
