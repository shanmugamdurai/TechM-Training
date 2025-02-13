import java.util.*;

public class SetSamples {
  public static void main(String[] args) {
      Set<Integer> hs = new HashSet<>();
      HashSet<String> lhs = new LinkedHashSet<>();
      TreeSet<Double> ts = new TreeSet<>();
      setSamples(hs);
      setSamples(lhs);
      setSamples(ts);
  }
    public static void setSamples(Set<Integer> hs) {

        hs.add(46);
        hs.add(63);
        hs.add(84);
        hs.add(33);
        hs.add(28);
        hs.add(35);
        hs.add(67);
        hs.add(16);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        /*System.out.print("Using iterator : ");
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : "); */
        hs.remove(3);
        System.out.println("\nHashSet after removing element : " + hs);
        System.out.println("Numbers divisible by seven ");
        for (Integer i : hs) {
            if(i%7==0)
                System.out.println(i+" ");
        }

    }
    public static void setSamples(HashSet<String> lhs) {
        lhs.add("Lion");
        lhs.add("ThankYou");
        lhs.add("Interstellar");
        lhs.add("Vidamuyarchi");
        lhs.add("Cat");
        lhs.add("frog");
        lhs.add("Elephant");
        lhs.add("Win");
        System.out.println("Linked HashSet Size: " + lhs.size());
        System.out.println("Elements in Linked HashSet: " + lhs);
        lhs.remove("frog");
        System.out.println("\nLinked HashSet after removing  one element : " + lhs);
        for(String s:lhs) {
            if(s.length()>5)
                System.out.println(s +" ");
        }
    }
    public static void setSamples(TreeSet<Double> ts) {
        ts.add(46.56);
        ts.add(63.75);
        ts.add(84.98);
        ts.add(17.25);
        ts.add(28.98);
        ts.add(35.56);
        ts.add(67.89);
        ts.add(16.80);
        System.out.println("TreeSet Size: " + ts.size());
        System.out.println("Elements in TreeSet: " + ts);
        ts.remove(28.98);
        System.out.println("\nTreeSet after removing  one element : " + ts);
        for(Double d :ts)
        {
            if(d>20)
                System.out.println(d+" ");
        }
        System.out.println("Numbers greater than 20");
    }
}

