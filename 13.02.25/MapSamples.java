import java.util.*;

public class MapSamples {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println("Initial HashMap hm1 are : "
                + hm);
        hm.put(2, "For");
        System.out.println("Updated Map " + hm);
        hm.remove(1);
        System.out.println("Mappings after removal are : "
                + hm);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        System.out.println("Initial HashTable ht are : "
                + ht);
        ht.put(2, "For");
        System.out.println("Updated Map " + ht);
        ht.remove(1);
        System.out.println("Mappings after removal are : "
                + ht);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : ht.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1, "one");
        tm.put(2, "two");
        tm.put(3, "three");
        System.out.println("Initial TreeMap tm are : "
                + hm);
        tm.put(2, "For");
        System.out.println("Updated Map " + tm);
        tm.remove(1);
        System.out.println("Mappings after removal are : "
                + tm);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : tm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1, "one");
        lhm.put(2, "two");
        lhm.put(3, "three");
        System.out.println("Initial LinkedHashMap lhm1 are : "
                + lhm);
        lhm.put(2, "For");
        System.out.println("Updated Map " + lhm);
        lhm.remove(1);
        System.out.println("Mappings after removal are : "
                + lhm);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : lhm.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }
}
