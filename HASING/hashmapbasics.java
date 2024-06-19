package HASING;

import java.util.HashMap;
import java.util.Map;

public class hashmapbasics {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "arwin");
        hashMap.put(3, "gurleen");
        hashMap.put(5, "aanchal");
        System.out.println("Hashmap of given data is " + hashMap);
        // if (hashMap.containsKey(1)) {
        //     System.out.println("it contains the key");
        // }
        // System.out.println(hashMap.containsKey(3));
        // System.out.println(hashMap.get(1));
        // System.out.println(hashMap.get(9));
        //iteration in the hashmap
        // int arr[] = { 1, 3, 5 };
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i] + " ");
        // }
        // System.out.println();
        // for (int val : arr) {
        //     System.out.println(val + " ");
        // }
        // System.out.println();
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //for removal of the value in the hashmap
        hashMap.remove(1);
        System.out.println("after the removal of the value hashmap changes from "+hashMap);
       
    }
}
