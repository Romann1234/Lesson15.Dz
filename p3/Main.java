package p3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
       Keys(hash);
       Set<String> keys=hash.keySet();
       System.out.println(keys);
    }
    public static void Keys(Map hash) {
        do {
            double random = Math.random() * 10000;
            hash.put((int) random,"Element");
            if(hash.containsKey(random)){
                hash.remove(random);
            }

        } while (hash.size()<10000);
        System.out.println("Size: "+hash.size());
        //System.out.println(hash);

    }
}