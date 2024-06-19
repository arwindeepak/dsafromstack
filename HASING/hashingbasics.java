
package HASING;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class hashingbasics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // ArrayList<Integer> list = new ArrayList<>();
       
        //insert operation in hashing
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(1);
      
        //Search contains
        if (set.contains(3)) {
            System.out.println("yes it contains the key");
        }
        System.out.println(set);

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
